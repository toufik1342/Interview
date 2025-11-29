package com.example.qascoring.ui.theme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
@Composable
fun QAScoringTheme(content: @Composable () -> Unit) {
    MaterialTheme(colors = darkColors(), content = content)
}
