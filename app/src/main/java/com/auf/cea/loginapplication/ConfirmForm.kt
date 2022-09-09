package com.auf.cea.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.auf.cea.loginapplication.databinding.ActivityConfirmFormBinding

class ConfirmForm : AppCompatActivity() {
    private lateinit var binding : ActivityConfirmFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfirmFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}