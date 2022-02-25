package com.kotlin.kotlinuiux.bottom_navigations.with_floating_bottom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kotlin.kotlinuiux.R

class FloatingButtonBnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_button_bn)

        val buttonNavigationview =findViewById<BottomNavigationView>(R.id.buttonNavigationview)
        buttonNavigationview.background=null
        buttonNavigationview.menu.getItem(2).isEnabled=false

    }
}