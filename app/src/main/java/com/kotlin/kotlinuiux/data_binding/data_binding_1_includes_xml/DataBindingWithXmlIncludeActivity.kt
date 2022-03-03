package com.kotlin.kotlinuiux.data_binding.data_binding_1_includes_xml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.kotlinuiux.R
import com.kotlin.kotlinuiux.data_binding.data_binding_1.UserModel
import com.kotlin.kotlinuiux.databinding.ActivityDataBindingWithXmlIncludeBinding
import com.kotlin.kotlinuiux.databinding.ActivityDatabinding1Binding

class DataBindingWithXmlIncludeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBindingWithXmlIncludeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDataBindingWithXmlIncludeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myUserModel = UserModel("Kalindu", "Supun", 32, true)

        binding.userModel = myUserModel
    }
}