package com.example.learning_compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.MotionLayout
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(name = "dong")
        }
    }
}

//@Composable
//fun ProfileHeader(){
//    MotionLayout(motionScene = ) {
//
//    }
//}

@Composable
fun MessageCard(name: String){
    Text (text = "Hello $name !")
}

@Preview(name = "newLine2 greeting")
@Composable
fun previewGreeting(){
    MessageCard(name = "dong")
}


@Preview(name = "newLine greeting")
@Composable
fun PreviewGreeting2(){
    MessageCard(name = "donglee")
}



