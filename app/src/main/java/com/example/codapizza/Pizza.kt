/*Coda Pizza
Brigitte Smith
This application opens to the screen of a pizza builder with live price updates as you create your pie.
May 14, 2026 - Project Created, Added State Hoisting
May 15, 2026 - Added Placement Dialogue and Pizza Hero theme
 */

package com.example.codapizza
import android.os.Parcelable
import com.example.codapizza.ToppingPlacement.*
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pizza(
    val toppings: Map<Topping, ToppingPlacement> = emptyMap()
) : Parcelable {
    //Calculates the total cost of each pizza as the user adds and removes toppings.
    val price: Double
        get() = 9.99 + toppings.asSequence()
            .sumOf { (_, toppingPlacement) ->
                when (toppingPlacement) {
                    Left, Right -> 0.5
                    All -> 1.0
                }
            }

    // Returns a copy of the pizza state
    fun withTopping(topping: Topping, placement: ToppingPlacement?): Pizza {
        return copy(
            toppings = if (placement == null) {
                toppings - topping
            } else {
                toppings + (topping to placement)
            }
        )
    }
}