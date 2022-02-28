package com.kotlin.kotlinuiux.data_binding.data_binding_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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


    }
}