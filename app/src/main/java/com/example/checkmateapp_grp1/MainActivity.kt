package com.example.checkmateapp_grp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signUpClick: TextView
    private lateinit var forgotPassClick: TextView
    private lateinit var loginButton: Button

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        emailEditText = findViewById(R.id.edtEmail)
        passwordEditText = findViewById(R.id.edtPass)
        loginButton = findViewById(R.id.btnLogin)
        signUpClick = findViewById(R.id.txtSignUp)
        forgotPassClick = findViewById(R.id.txtForgot)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            val myIntent = Intent(this, HomePage::class.java)
                            startActivity(myIntent)
                            finish()
                        } else {
                            Toast.makeText(this, "Authentication failed. Check your email and password.", Toast.LENGTH_SHORT).show()
                        }
                    }
            } else {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }
        }

        signUpClick.setOnClickListener {
            val myIntent = Intent(this, SignUp::class.java)
            startActivity(myIntent)
        }

        forgotPassClick.setOnClickListener {
            val myIntent = Intent(this, ForgotPassword::class.java)
            startActivity(myIntent)
        }
    }
}
        /*
        Sign the user out
        auth.signOut()

         */
        /*
        val forgotPassClick = findViewById<TextView>(R.id.txtForgot)
        val signUpClick = findViewById<TextView>(R.id.txtSignUp)


        var buttonLogin : Button = findViewById(R.id.btnLogin)

         */

        /*
        forgotPassClick.setOnClickListener {
            val myIntent = Intent(this, ForgotPassword::class.java)
            startActivity(myIntent)
        }

        signUpClick.setOnClickListener {
            val myIntent = Intent(this, SignUp::class.java)
            startActivity(myIntent)
        }

        buttonLogin.setOnClickListener {
            val myIntent = Intent(this, HomePage::class.java)
            startActivity(myIntent)
        }

         */

