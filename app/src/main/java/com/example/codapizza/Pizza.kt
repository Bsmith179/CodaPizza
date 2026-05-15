package com.example.codapizza

data class Pizza(
    val toppings: Map<Topping, ToppingPlacement> = emptyMap()
)