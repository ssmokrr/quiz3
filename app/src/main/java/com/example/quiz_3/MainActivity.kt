package com.example.quiz_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val id:Int = 10
    val language:String = "kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener() {
            intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("id_value", id)
            intent.putExtra("language_value", language)
            startActivity(intent)
        }
    }
}