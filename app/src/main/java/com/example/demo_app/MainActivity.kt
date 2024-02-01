package com.example.demo_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.sample_library.PerformAction
import com.example.sample_library.PointClass
import com.example.sample_library.PrintMethod
import com.example.sample_library.print

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        println("MainActivity Calling  >>>>")

        PerformAction().mainFunction("VEMIREDDY")
        PointClass().myMethod("SAMBASIVA")
        PrintMethod("SAMBASIVA REDDY").print("REDDY")

    }
}