package com.basebox.fun_fact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.basebox.fun_fact.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private var binding: ActivityLoginBinding? = null
    private var email:String?  = null
    private var password:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        email = "martinirex@yahoo.co.uk"
        password = "adminpassword"

        setUpLogin(email!!, password!!)
    }

    private fun setUpLogin(email: String, password: String) {
        if (email == "martinirex@yahoo.co.uk" && password == "adminpassword"){
            binding?.btnLogin?.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)

                startActivity(intent)

            }
        }
    }
}