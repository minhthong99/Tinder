package com.example.tinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()
        btn_sign_out.setOnClickListener {
            signOut()
        }
        btn_setting.setOnClickListener {
            startActivity(Intent(this,SettingActivity::class.java))
            finish()
        }

    }
    private fun signOut(){
        auth.signOut()
        startActivity(Intent(this, Login_Activity::class.java))

        finish()
    }
}

