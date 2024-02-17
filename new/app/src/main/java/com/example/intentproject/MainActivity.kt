package com.example.intentproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    /* //declaring the variable
    lateinit var nameEditText: EditText
    lateinit var ageEditText: EditText
    lateinit var submit_btn:Button*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declare id's of name, age
        val nameEditText: EditText =findViewById(R.id.name);
        val ageEditText: EditText =findViewById(R.id.age);
        val submit_btn: Button =findViewById(R.id.submit)

        submit_btn.setOnClickListener{
            val name=nameEditText.text.toString()
            val age=ageEditText.text.toString().toInt()
            val year=2024-age

            val intent= Intent(this,DisplayActivity::class.java);
            intent.putExtra("name",name)
            //intent.putExtra("age",age)
            intent.putExtra("year",year)
            startActivity(intent)
        }


    }
}