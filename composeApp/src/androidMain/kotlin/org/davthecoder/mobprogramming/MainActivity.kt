package org.davthecoder.mobprogramming

import App
import Platform
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {
    private val greeting by inject<Platform>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(
                greeting = greeting.name
            )
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App(greeting = "Android Preview")
}