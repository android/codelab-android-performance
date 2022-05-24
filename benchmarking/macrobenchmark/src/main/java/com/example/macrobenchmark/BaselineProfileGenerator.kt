/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.macrobenchmark

import androidx.benchmark.macro.ExperimentalBaselineProfilesApi
import androidx.benchmark.macro.MacrobenchmarkScope
import androidx.benchmark.macro.junit4.BaselineProfileRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.By
import androidx.test.uiautomator.Direction
import androidx.test.uiautomator.Until
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.random.Random

@OptIn(ExperimentalBaselineProfilesApi::class)
@RunWith(AndroidJUnit4::class)
class BaselineProfileGenerator {

    @get:Rule
    val rule = BaselineProfileRule()

    @Test
    fun generate() {
        rule.collectBaselineProfile("com.example.macrobenchmark_codelab") {
            startApplicationJourney()
            scrollSnackListJourney()
            goToSnackDetailJourney()
        }
    }
}

fun MacrobenchmarkScope.startApplicationJourney() {
    pressHome()
    startActivityAndWait()
    val contentList = device.findObject(By.res("snack_list"))
    // Wait until a snack collection item within the list is rendered
    contentList.wait(Until.hasObject(By.res("snack_collection")), 5_000)
}

fun MacrobenchmarkScope.scrollSnackListJourney() {
    val snackList = device.findObject(By.res("snack_list"))
    // Set gesture margin to avoid triggering gesture navigation
    snackList.setGestureMargin(device.displayWidth / 5)
    snackList.fling(Direction.DOWN)
    device.waitForIdle()
}

fun MacrobenchmarkScope.goToSnackDetailJourney() {
    val snackList = device.findObject(By.res("snack_list"))
    val snacks = snackList.findObjects(By.res("snack_item"))
    // Select random snack from the list
    snacks[Random.nextInt(snacks.size)].click()
    // Wait until the screen is gone - the detail is shown
    device.wait(Until.gone(By.res("snack_list")), 5_000)
    device.waitForIdle()
}
