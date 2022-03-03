package com.kotlin.kotlinuiux.data_binding.data_binding_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.kotlin.kotlinuiux.R
import com.kotlin.kotlinuiux.databinding.ActivityDatabinding1Binding

class DatabindingActivity_1 : AppCompatActivity() {

    private lateinit var binding: ActivityDatabinding1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDatabinding1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val myUserModel = UserModel("Kalindu", "Supun", 32, true)

        binding.userModel = myUserModel

       /* binding.editText1.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(char: CharSequence?, p1: Int, p2: Int, p3: Int) { }

            override fun onTextChanged(char: CharSequence?, p1: Int, p2: Int, p3: Int) {

                println("aaaaaaaa "+char.toString())
            }

            override fun afterTextChanged(p0: Editable?) { }


        })*/


    }
}