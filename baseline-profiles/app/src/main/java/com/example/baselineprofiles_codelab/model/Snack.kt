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

package com.example.baselineprofiles_codelab.model

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import com.example.baselineprofiles_codelab.R // Or your R file if different e.g. com.example.jetsnack.R

@Immutable
data class Snack(
    val id: Long,
    val name: String,
    @DrawableRes
    val imageRes: Int, // Changed from imageUrl: String to imageRes: Int
    val price: Long,
    val tagline: String = "",
    val tags: Set<String> = emptySet()
)

/**
 * Static data
 */

val snacks = listOf(
    Snack(
        id = 1L,
        name = "Cupcake",
        tagline = "A tag line",
        imageRes = R.drawable.cupcake, // Assuming R.drawable.cupcake exists
        price = 299
    ),
    Snack(
        id = 2L,
        name = "Donut",
        tagline = "A tag line",
        imageRes = R.drawable.donut, // Assuming R.drawable.donut exists
        price = 299
    ),
    Snack(
        id = 3L,
        name = "Eclair",
        tagline = "A tag line",
        imageRes = R.drawable.eclair, // Assuming R.drawable.eclair exists
        price = 299
    ),
    Snack(
        id = 4L,
        name = "Froyo",
        tagline = "A tag line",
        imageRes = R.drawable.froyo, // Assuming R.drawable.froyo exists
        price = 299
    ),
    Snack(
        id = 5L,
        name = "Gingerbread",
        tagline = "A tag line",
        imageRes = R.drawable.gingerbread, // Assuming R.drawable.gingerbread exists
        price = 499
    ),
    Snack(
        id = 6L,
        name = "Honeycomb",
        tagline = "A tag line",
        imageRes = R.drawable.honeycomb, // Assuming R.drawable.honeycomb exists
        price = 299
    ),
    Snack(
        id = 7L,
        name = "Ice Cream Sandwich",
        tagline = "A tag line",
        imageRes = R.drawable.ice_cream_sandwich, // Assuming R.drawable.ice_cream_sandwich exists
        price = 1299
    ),
    Snack(
        id = 8L,
        name = "Jellybean",
        tagline = "A tag line",
        imageRes = R.drawable.jelly_bean, // Assuming R.drawable.jelly_bean exists (note the underscore)
        price = 299
    ),
    Snack(
        id = 9L,
        name = "KitKat",
        tagline = "A tag line",
        imageRes = R.drawable.kitkat, // Assuming R.drawable.kitkat exists
        price = 549
    ),
    Snack(
        id = 10L,
        name = "Lollipop",
        tagline = "A tag line",
        imageRes = R.drawable.lollipop, // Assuming R.drawable.lollipop exists
        price = 299
    ),
    Snack(
        id = 11L,
        name = "Marshmallow",
        tagline = "A tag line",
        imageRes = R.drawable.marshmallow, // Assuming R.drawable.marshmallow exists
        price = 299
    ),
    Snack(
        id = 12L,
        name = "Nougat",
        tagline = "A tag line",
        imageRes = R.drawable.nougat, // Assuming R.drawable.nougat exists
        price = 299
    ),
    Snack(
        id = 13L,
        name = "Oreo",
        tagline = "A tag line",
        imageRes = R.drawable.oreo, // Assuming R.drawable.oreo exists
        price = 299
    ),
    Snack(
        id = 14L,
        name = "Pie",
        tagline = "A tag line",
        imageRes = R.drawable.pie, // Assuming R.drawable.pie exists
        price = 299
    ),
    Snack(
        id = 15L,
        name = "Chips",
        imageRes = R.drawable.chips, // Assuming R.drawable.chips exists
        price = 299
    ),
    Snack(
        id = 16L,
        name = "Pretzels",
        imageRes = R.drawable.pretzels, // Assuming R.drawable.pretzels exists
        price = 299
    ),
    Snack(
        id = 17L,
        name = "Smoothies",
        imageRes = R.drawable.smoothies, // Assuming R.drawable.smoothies exists
        price = 299
    ),
    Snack(
        id = 18L,
        name = "Popcorn",
        imageRes = R.drawable.popcorn, // Assuming R.drawable.popcorn exists
        price = 299
    ),
    Snack(
        id = 19L,
        name = "Almonds",
        imageRes = R.drawable.almonds, // Assuming R.drawable.almonds exists
        price = 299
    ),
    Snack(
        id = 20L,
        name = "Cheese",
        imageRes = R.drawable.cheese, // Assuming R.drawable.cheese exists
        price = 299
    ),
    Snack(
        id = 21L,
        name = "Apples",
        tagline = "A tag line",
        imageRes = R.drawable.apples, // Assuming R.drawable.apples exists
        price = 299
    ),
    Snack(
        id = 22L,
        name = "Apple sauce",
        tagline = "A tag line",
        imageRes = R.drawable.apple_sauce, // Assuming R.drawable.apple_sauce exists
        price = 299
    ),
    Snack(
        id = 23L,
        name = "Apple chips",
        tagline = "A tag line",
        imageRes = R.drawable.apple_chips, // Assuming R.drawable.apple_chips exists
        price = 299
    ),
    Snack(
        id = 24L,
        name = "Apple juice",
        tagline = "A tag line",
        imageRes = R.drawable.apple_juice, // Assuming R.drawable.apple_juice exists
        price = 299
    ),
    Snack(
        id = 25L,
        name = "Apple pie",
        tagline = "A tag line",
        imageRes = R.drawable.apple_pie, // Assuming R.drawable.apple_pie exists
        price = 299
    ),
    Snack(
        id = 26L,
        name = "Grapes",
        tagline = "A tag line",
        imageRes = R.drawable.grapes, // Assuming R.drawable.grapes exists
        price = 299
    ),
    Snack(
        id = 27L,
        name = "Kiwi",
        tagline = "A tag line",
        imageRes = R.drawable.kiwi, // Assuming R.drawable.kiwi exists
        price = 299
    ),
    Snack(
        id = 28L,
        name = "Mango",
        tagline = "A tag line",
        imageRes = R.drawable.mango, // Assuming R.drawable.mango exists
        price = 299
    )
)
