package com.basebox.fun_fact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.basebox.fun_fact.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val TAG = "LoginActivity"

    private var emailUsed: String? = null
    private var passwordUsed: String? = null

    private var binding: ActivityLoginBinding? = null
    private var email:String?  = null
    private var password:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        email = "martinirex@yahoo.co.uk"
        password = "adminpassword"



        binding?.btnLogin?.setOnClickListener {
            emailUsed = binding?.email?.editText?.text.toString()
            passwordUsed = binding?.password?.editText?.text.toString()
            Log.d(TAG, "Values of userEmail $emailUsed and userPassword $passwordUsed")
            if (emailUsed == email && passwordUsed == password){
                val intent = Intent(this, MainActivity::class.java)

                startActivity(intent)

            }
        }
    }

//    private fun setUpLogin(email: String, password: String) {
//
//
//    }
}