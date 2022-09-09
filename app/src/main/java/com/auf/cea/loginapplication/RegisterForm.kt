package com.auf.cea.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.auf.cea.loginapplication.databinding.ActivityRegisterFormBinding

class RegisterForm : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterFormBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterFormBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}