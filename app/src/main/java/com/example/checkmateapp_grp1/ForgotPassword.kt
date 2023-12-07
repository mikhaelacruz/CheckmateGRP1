package com.example.checkmateapp_grp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            val sPassword = edtPassword.text.toString()
            auth.sendPasswordResetEmail(sPassword)
                .addOnSuccessListener {
                    Toast.makeText(this, "Please Check your Email", Toast.LENGTH_SHORT).show()

                }
                .addOnFailureListener {
                    Toast.makeText(this, it.toString(), Toast.LENGTH_SHORT).show()
                }

            //var buttonForgot : Button = findViewById(R.id.btnForgotPass)

            //buttonForgot.setOnClickListener {
            //    val myIntent = Intent(this, SignUp::class.java)
            //    startActivity(myIntent)
            //}
        }
        logInClick.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }
    }
}