package com.umidjondev.greetingcardproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public final fun textChanger(view: View){
        val editedText=findViewById<EditText>(R.id.editTextTextPersonName2).text.toString()
        val editedText1=findViewById<EditText>(R.id.editTextTextPersonName3).text.toString()
        val editedText2=findViewById<EditText>(R.id.editTextTextPersonName4).text.toString()
        val myTextComponent = findViewById<TextView>(R.id.changeTxt)
        val myTextComponent1 = findViewById<TextView>(R.id.changeTxt2)
        val myTextComponent2 = findViewById<TextView>(R.id.changeTxt3)
        myTextComponent.setText("Your First Name : "+editedText)
        myTextComponent1.setText("Your Last Name : "+editedText1)
        myTextComponent2.setText("Your Email Address : "+editedText2)
    }
}