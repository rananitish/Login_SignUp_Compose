package com.example.startingscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Preview
@Composable
fun SignUp(){
    Card(
        modifier = Modifier
                .width(350.dp).fillMaxHeight(),
        shape = RoundedCornerShape(20.dp),
        backgroundColor = Color.White


        ) {
        var name = remember { mutableStateOf("") }
        var email = remember { mutableStateOf("") }
        var password = remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            OutlinedTextField(
                value = name.value,
                onValueChange = { name.value = it },
                label = { Text("Name") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = email.value,
                onValueChange = { email.value = it },
                label = { Text("Email") },
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions(
                    onNext = { /* Handle action */ }
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = password.value,
                onValueChange = { password.value = it },
                label = { Text("Password") },
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions(
                    onDone = { /* Handle action */ }
                ),
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    // Handle registration logic here
                },
                shape = CircleShape,
                colors = androidx.compose.material.ButtonDefaults.textButtonColors(
                    backgroundColor = Color.Blue,
                    contentColor = Color.White
                ),
                ) {
                Text("Register")
            }
    }
}}
