/*Coda Pizza
Brigitte Smith
This application opens to the screen of a pizza builder with live price updates as you create your pie.
May 15, 2026
 */

package com.example.codapizza

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PizzaBuilderScreen()
        }
    }

}