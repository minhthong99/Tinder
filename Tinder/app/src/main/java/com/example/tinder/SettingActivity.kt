package com.example.tinder

import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tinder.model.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_setting.*

class SettingActivity : AppCompatActivity()  {

    private lateinit var auth: FirebaseAuth
    private lateinit var database: DatabaseReference
//    lateinit var editTextName :EditText
//    lateinit var editTextAddress:EditText
//    lateinit var editTextPhone:EditText
//    lateinit var editTextAge:EditText
//    lateinit var radioGroup: RadioGroup
//    lateinit var btn_confirm: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        auth = FirebaseAuth.getInstance()

        btn_back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
            finish()
        }
//        editTextName=findViewById(R.id.editTextName)
//        editTextAddress=findViewById(R.id.editTextAddress)
//        editTextAge=findViewById(R.id.editTextAge)
//        editTextPhone=findViewById(R.id.editTextPhone)

        btn_confirm.setOnClickListener{
            saveUserInfo()

        }
    }


    private fun saveUserInfo() {
    }
//        val name =editTextName.text.toString().trim()
//        val phone=editTextPhone.text.toString().trim()
//        val address=editTextAddress.text.toString().trim()
//        val age=editTextAge.text.toString().trim()
//        if(name.isEmpty()){
//            editTextName.error="please enter a name"
//            return
//        }
//
//        val ref = FirebaseDatabase.getInstance().getReference("users")
//
//        val user =User(name,phone,address,age)
//        ref.setValue(user).addOnCompleteListener {
//            Toast.makeText(applicationContext,"Save success",Toast.LENGTH_LONG).show()





//    private fun saveUserInfo(userId:String,name:String,phone:Number,age:Int,address:String,sex:String){
//    val user =User(name,phone,age,address,sex)
//    FirebaseDatabase.getInstance().reference.child("users").child(userId).setValue(user)



}