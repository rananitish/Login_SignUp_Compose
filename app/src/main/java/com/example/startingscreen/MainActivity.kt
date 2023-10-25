package com.example.startingscreen

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.startingscreen.ui.theme.StartingScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StartingScreenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    greet()
                }
            }

        }
    }
}

@Composable
fun greet(){
    SignUp()
}
//@Composable
//fun Cred(text:String){
//    var text = remember{mutableStateOf(text)}
//    OutlinedTextField(value=text.value,
//        onValueChange={text.value=it},
//        placeholder={Text("Enter email")},
//        label = {Text("Mail")},
//        leadingIcon = {
//            Icon(imageVector= Icons.Outlined.MailOutline,contentDescription = "Lock Icon")
//        }
//    )
//    Spacer(modifier = Modifier.height(10.dp))
//    var pass = remember{mutableStateOf("")}
//    var show = remember{mutableStateOf(false)}
//    OutlinedTextField(value=pass.value,
//        onValueChange={pass.value=it},
//        placeholder={Text("Enter password")},
//        label = {Text("Password")},
//        leadingIcon = {
//            Icon(imageVector= Icons.Outlined.Lock,contentDescription = "Lock Icon")
//        },
//        visualTransformation = if (show.value) VisualTransformation.None else PasswordVisualTransformation()
//
//    )
//
//
//
//}
//
//
//
//@Composable
//fun Display(){
//    Card(
//        elevation = 4.dp,
//        shape = RoundedCornerShape(20.dp),
//        backgroundColor = Color.White,
//        modifier = Modifier.padding(20.dp)
//            .height(200.dp).width(350.dp)
//
//
//    ) {
//       Column(
//           horizontalAlignment = Alignment.CenterHorizontally,
//           verticalArrangement = Arrangement.Center
//
//       ) {
//           var text = remember{mutableStateOf("")}
//           Cred(text.value)
//           Spacer(modifier = Modifier.height(10.dp))
//       }
//
//    }
//}
//@Composable
//fun Buttons( text :String,color: Color,onClick:()->Unit){
//    Button(onClick = onClick,
//        shape = CircleShape,
//        modifier = Modifier.padding(5.dp),
//        colors = ButtonDefaults.textButtonColors(
//            backgroundColor = color,
//            contentColor = Color.White
//        )
//    ) {
//        Text(text = text)
//
//
//    }
//}
//@Composable
//fun Screen(){
//Column{
//    Column(
//        modifier = Modifier
//            .background(color = Color.Black)
//            .fillMaxWidth().fillMaxHeight(0.8f)
//        ,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Display()
//        Spacer(modifier = Modifier.height(10.dp))
//        Buttons("Login",Color.Blue,{})
//
//    }
//
//    Column(
//        modifier = Modifier
//            .background(color = Color.Black)
//            .fillMaxWidth().fillMaxHeight(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ){
//        //to navigate to signup screen
//        Text(text="New User ? Here's Sign Up",color = Color.White, fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic,
//        modifier = Modifier
//            .clickable{
//
//            })
//    }
//
//}}
//
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//  Screen()
//}