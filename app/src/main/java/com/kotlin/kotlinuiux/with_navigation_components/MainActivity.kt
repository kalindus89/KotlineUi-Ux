package com.kotlin.kotlinuiux.with_navigation_components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kotlin.kotlinuiux.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController =findNavController(R.id.fragmentContainerView)
        val bottomNavigationView =findViewById<BottomNavigationView>(R.id.bottomNavigationNc)

        bottomNavigationView.setupWithNavController(navController)


    }
}