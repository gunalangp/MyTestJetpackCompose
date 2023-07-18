package com.smartgaldiator.mytestjetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smartgaldiator.mytestjetpackcompose.ui.theme.MyTestJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Column() {
               Text(text = "Hello compose", style = TextStyle(background = Color.Blue, color = Color.White,
                   fontSize = 24.sp, shadow = Shadow(color = Color.Blue, blurRadius = 3f)
               ), modifier = Modifier.padding(8.dp))
               Spacer(modifier = Modifier.height(8.dp).width(8.dp))
               Button(onClick = {
                   Toast.makeText(applicationContext, "clicked me", Toast.LENGTH_LONG).show()
               }, shape = RoundedCornerShape(10), modifier = Modifier.padding(8.dp)) {
                   Text(text = "Click me", style = TextStyle(color = Color.Black,
                       fontSize = 24.sp, shadow = Shadow(color = Color.Blue, blurRadius = 3f)
                   ))
               }
           }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyTestJetpackComposeTheme {
        Greeting("Android")
    }
}