/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.macrobenchmark

import androidx.benchmark.macro.CompilationMode
import androidx.benchmark.macro.FrameTimingMetric
import androidx.benchmark.macro.StartupMode
import androidx.benchmark.macro.junit4.MacrobenchmarkRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.By
import androidx.test.uiautomator.Direction
import androidx.test.uiautomator.Until
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ScrollBenchmarks {
    @get:Rule
    val benchmarkRule = MacrobenchmarkRule()

    @Test
    fun scrollCompilationNone() = scroll(CompilationMode.None())

    @Test
    fun scrollCompilationPartial() = scroll(CompilationMode.Partial())

    private fun scroll(compilationMode: CompilationMode) {
        benchmarkRule.measureRepeated(
            packageName = "com.example.macrobenchmark_codelab",
            iterations = 5,
            metrics = listOf(FrameTimingMetric()),
            compilationMode = compilationMode,
            startupMode = StartupMode.COLD,
            setupBlock = {
                // Start the default activity, but don't measure the frames yet
                pressHome()
                startActivityAndWait()
            }
        ) {
            val contentList = device.findObject(By.res("snack_list"))

            val searchCondition = Until.hasObject(By.res("snack_collection"))
            // Wait until a snack collection item within the list is rendered
            contentList.wait(searchCondition, 5_000)

            // Set gesture margin to avoid triggering gesture navigation
            contentList.setGestureMargin(device.displayWidth / 5)

            // Scroll down the list
            contentList.fling(Direction.DOWN)

            // Wait for the scroll to finish
            device.waitForIdle()
        }
    }
}
