package com.example.codapizza

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ToppingCell() {
    Row {
        Checkbox(
            checked = true,
            onCheckedChange = { /* TODO */ }
        )

        Column {
            Text(
                text = "Pineapple"
            )

            Text(
                text = "Whole pizza"
            )
        }
    }
}