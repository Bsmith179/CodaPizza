/*Coda Pizza
Brigitte Smith
This application opens to the screen of a pizza builder with live price updates as you create your pie.
May 15, 2026
 */

package com.example.codapizza

import androidx.annotation.StringRes

enum class ToppingPlacement(
    @StringRes val label: Int
) {
    Left(R.string.placement_left),
    Right(R.string.placement_right),
    All(R.string.placement_all)
}