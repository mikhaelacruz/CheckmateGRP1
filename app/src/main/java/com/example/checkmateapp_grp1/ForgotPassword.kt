package com.example.checkmateapp_grp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class ForgotPassword : AppCompatActivity() {
    private lateinit var edtPassword: EditText
    private lateinit var btnForgotPass: Button
    private lateinit var logInClick: TextView

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        edtPassword = findViewById(R.id.edtEmailForgotPass)
        btnForgotPass = findViewById(R.id.btnForgotPass)
        logInClick = findViewById(R.id.txtLogIn2)

        auth = FirebaseAuth.getInstance()

        btnForgotPass.setOnClickListener {
            val sEmail = edtPassword.text.toString()
            if (sEmail.isEmpty()) {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            auth.sendPasswordResetEmail(sEmail)
                .addOnSuccessListener {
                    Toast.makeText(this, "Please Check your Email", Toast.LENGTH_SHORT).show()
                }
                .addOnFailureListener { e ->
                    // Log the exception for debugging
                    Log.e("ForgotPassword", "Error sending password reset email", e)

                    // Print the exception details to the console
                    e.printStackTrace()

                    // Show a toast with a generic error message
                    Toast.makeText(this, "Error sending password reset email", Toast.LENGTH_SHORT)
                        .show()
                }

            logInClick.setOnClickListener {
                val myIntent = Intent(this, MainActivity::class.java)
                startActivity(myIntent)
            }
        }
    }
}
