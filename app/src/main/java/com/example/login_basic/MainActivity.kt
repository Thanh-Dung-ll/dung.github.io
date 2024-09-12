package com.example.login_basic

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var usernameip : EditText
    lateinit var passwordip : EditText
    lateinit var loginbt : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        usernameip = findViewById(R.id.username)
        passwordip= findViewById(R.id.pass)
        loginbt = findViewById(R.id.button_login)
        loginbt.setOnClickListener(){
            val username = usernameip.text.toString()
            val password= passwordip.text.toString()
            Log.i(TAG, "username : $username and pass = $password ")
        }
        }
    }
