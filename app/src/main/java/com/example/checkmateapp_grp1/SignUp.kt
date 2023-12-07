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
import com.google.firebase.database.FirebaseDatabase

class SignUp : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var fullNameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var signUpButton: Button
    private lateinit var logInClick: TextView
    private lateinit var auth: FirebaseAuth
    private lateinit var database: FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()

        emailEditText = findViewById(R.id.edtEmailSignUp)
        fullNameEditText = findViewById(R.id.edtFullName)
        passwordEditText = findViewById(R.id.edtPassSignUp)
        confirmPasswordEditText = findViewById(R.id.edtConfirmPassSignUp)
        signUpButton = findViewById(R.id.btnSignUp)

        signUpButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val fullName = fullNameEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()
            val confirmPassword = confirmPasswordEditText.text.toString().trim()

            if (validatePassword(password) && password == confirmPassword) {
                if (email.isNotEmpty() && fullName.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()) {
                    auth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(this) { task ->
                            if (task.isSuccessful) {
                                Log.d("SignUp", "createUserWithEmail:success")
                                val userId = auth.currentUser?.uid
                                val usersRef = database.reference.child("users")
                                val user = User(userId, fullName, email)
                                usersRef.child(userId ?: "").setValue(user)
                                val myIntent = Intent(this, MainActivity::class.java)
                                startActivity(myIntent)
                            } else {
                                Log.w("SignUp", "createUserWithEmail:failure", task.exception)
                            }
                        }
                } else {
                    Toast.makeText(this, "Kindly fill all the information needed.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Invalid password. Password must contain at least one number and be at least 6 characters long.", Toast.LENGTH_SHORT).show()
            }
        }

        val logInClick = findViewById<TextView>(R.id.txtLogIn)
        logInClick.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }
    }

    private fun validatePassword(password: String): Boolean {
        val numberPattern = ".*\\d.*"
        return password.length >= 6 && password.matches(numberPattern.toRegex())
    }
}
          /*
        val logInClick = findViewById<TextView>(R.id.txtLogIn)
        var buttonSignUp : Button = findViewById(R.id.btnSignUp)

        logInClick.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }

        buttonSignUp.setOnClickListener {
            val myIntent = Intent(this, HomePage::class.java)
            startActivity(myIntent)


        }

         */
