package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random
var randomInt = Random.nextInt(0,100)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.button)

        
        myButton.setOnClickListener {
            // Code to be executed when the button is clicked

            Validate()
        }
    }
    fun Validate(){
        val inputText : EditText = findViewById(R.id.Text)
        val editText =findViewById<TextView>(R.id.TextVeiw)
        val input= Integer.parseInt(inputText.text.toString())

        if (input > randomInt){
            editText.text="your guess i Too HIgh $randomInt"

        }
        else if (input < randomInt)
            editText.text="your guess i  Low $randomInt"
        else{
            editText.text="ohh Hurrah U guessed it correctly Now Number is Changed"
            randomInt = Random.nextInt()
        }

    }
}
