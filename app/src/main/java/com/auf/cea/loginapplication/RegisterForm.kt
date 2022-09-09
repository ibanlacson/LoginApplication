package com.auf.cea.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.Toast
import com.auf.cea.loginapplication.databinding.ActivityRegisterFormBinding

class RegisterForm : AppCompatActivity(), View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    private lateinit var binding: ActivityRegisterFormBinding
    private var genderIndex = -1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterFormBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRegister.setOnClickListener(this)
        binding.btnRbGrp.setOnCheckedChangeListener(this)
    }

    override fun onClick(p0: View?) {
        if(binding.txtUsername.text.isEmpty()){
            binding.txtUsername.error = "Required"
            return
        }
        if (binding.txtPassword.text.isEmpty()){
            binding.txtPassword.error = "Required"
            return
        }
        if (binding.txtConfirm.text.isEmpty()){
            binding.txtConfirm.error = "Required"
            return
        }
        if (binding.txtFirst.text.isEmpty()){
            binding.txtFirst.error = "Required"
            return
        }
        if (binding.txtLast.text.isEmpty()){
            binding.txtLast.error = "Required"
            return
        }
        if (binding.txtAge.text.isEmpty()){
            binding.txtAge.error = "Required"
            return
        }
        if (genderIndex == -1){
            Toast.makeText(this,"Please specify your sex",Toast.LENGTH_SHORT).show()
            return
        }
    }

    override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
        val rb = binding.btnRbGrp.findViewById<View>(p1)
        genderIndex =  binding.btnRbGrp.indexOfChild(rb)
    }
}