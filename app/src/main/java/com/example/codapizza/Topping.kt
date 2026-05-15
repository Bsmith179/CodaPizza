/*Coda Pizza
Brigitte Smith
This application opens to the screen of a pizza builder with live price updates as you create your pie.
May 14, 2026 - Project Created, Added State Hoisting
May 15, 2026 - Added Placement Dialogue and Pizza Hero theme
 */

package com.example.codapizza

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


// Assigns each topping option a display name and an image reference
enum class Topping(
    @StringRes val toppingName: Int,
    @DrawableRes val pizzaOverlayImage: Int
) {
    Basil(
        toppingName = R.string.topping_basil,
        pizzaOverlayImage = R.drawable.topping_basil
    ),

    Mushroom(
        toppingName = R.string.topping_mushroom,
        pizzaOverlayImage = R.drawable.topping_mushroom
    ),

    Olive(
        toppingName = R.string.topping_olive,
        pizzaOverlayImage = R.drawable.topping_olive
    ),

    Peppers(
        toppingName = R.string.topping_peppers,
        pizzaOverlayImage = R.drawable.topping_peppers
    ),

    Pepperoni(
        toppingName = R.string.topping_pepperoni,
        pizzaOverlayImage = R.drawable.topping_pepperoni
    ),

    Pineapple(
        toppingName = R.string.topping_pineapple,
        pizzaOverlayImage = R.drawable.topping_pineapple
    ),

    Onion(
        toppingName = R.string.topping_onion,
        pizzaOverlayImage = R.drawable.topping_onion
    ),

    Spinach(
        toppingName = R.string.topping_spinach,
        pizzaOverlayImage = R.drawable.topping_spinach
    ),

    ExtraCheese(
        toppingName = R.string.topping_extra_cheese,
        pizzaOverlayImage = R.drawable.topping_extra_cheese
    )

}


