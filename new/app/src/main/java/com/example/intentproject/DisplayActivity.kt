package com.example.intentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val result: TextView =findViewById(R.id.result)
        val name=intent.extras?.getString("name")
        val year=intent.extras?.getInt("year")

        val message:String
        if(year in 1980..1990)
        {
            message="Hi $name..!,\nYour are born in $year.\nMiddle Aged, The person has more maturity, the person has great talents "
        }
        else if(year in 1991..2000)
        {
            message="Hi $name..!,\nYour born in $year.\nYoung Person, The person is evolving in all aspects, the person is a great companion."
        }
        else if(year in 2001..2024)
        {
            message="Hi $name..!,\nYour are born in $year.\nToo young to understand everything. Has a great opportunity to grow in every possible direction. Lot to explore is left."
        }
        else
        {
            message="please enter name and age.....!"
        }
        result.text=message
    }
}