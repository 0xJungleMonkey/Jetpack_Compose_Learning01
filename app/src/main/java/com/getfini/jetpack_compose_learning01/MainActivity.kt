package com.getfini.jetpack_compose_learning01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.getfini.jetpack_compose_learning01.ui.theme.Jetpack_Compose_Learning01Theme
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_Compose_Learning01Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
private fun Greeting(name: String) {
    Surface ( color=MaterialTheme.colorScheme.primary){
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(24.dp)
        )
    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jetpack_Compose_Learning01Theme {
        Greeting("Android")
    }
}