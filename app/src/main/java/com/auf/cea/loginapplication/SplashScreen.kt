package com.auf.cea.loginapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class SplashScreen : AppCompatActivity() {
    private var keepLogin:Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        val sharedPreferences = getSharedPreferences("MY_PREFERENCES", Context.MODE_PRIVATE)

        keepLogin = sharedPreferences.getBoolean(KEEP_ME_LOGIN,false)

        object : CountDownTimer(5000,1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                if (!keepLogin){
                    val intent = Intent(this@SplashScreen,MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(intent)
                } else {
                    val intent = Intent(this@SplashScreen,MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    startActivity(intent)
                }
            }
        }
    }
}