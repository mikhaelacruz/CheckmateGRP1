package com.example.checkmateapp_grp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class HomePage : AppCompatActivity() {
    private lateinit var SignOutButton: Button
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        auth = FirebaseAuth.getInstance()

        SignOutButton = findViewById(R.id.btnSignout)

        SignOutButton.setOnClickListener{
            auth.signOut()
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }
    }
}