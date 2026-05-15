package com.example.codapizza
/*Coda Pizza
Brigitte Smith
This application opens to the screen of a pizza builder with live price updates as you create your pie.
May 15, 2026
 */

import androidx.annotation.StringRes

enum class Topping(
    @StringRes val toppingName: Int
) {
    Basil(
        toppingName = R.string.topping_basil
    ),

    Mushroom(
        toppingName = R.string.topping_mushroom
    ),

    Olive(
        toppingName = R.string.topping_olive
    ),

    Peppers(
        toppingName = R.string.topping_peppers
    ),

    Pepperoni(
        toppingName = R.string.topping_pepperoni
    ),

    Pineapple(
        toppingName = R.string.topping_pineapple
    )
}