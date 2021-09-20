package com.example.passwordmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.sawolabs.androidsdk.Sawo

class SawoActivity : AppCompatActivity() {
    lateinit var login : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sawo)
        login = findViewById(R.id.loginBtn)
        login.setOnClickListener{
            Sawo(
                this,
                "78a6cfc9-4028-431b-9591-340ad6e9b8d9", // your api key
                "6148163c35bc1e03636124e6w8F8ohIsJ5TmEfBzAuvADYS8"  // your api key secret
            ).login(
                "email", // can be one of 'email' or 'phone_number_sms'
                MainActivity::class.java.name // Callback class name
            )

        }
    }
}