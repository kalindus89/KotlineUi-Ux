package com.kotlin.kotlinuiux.bottom_navigations.old_way

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kotlin.kotlinuiux.R

class OldwayActivity : AppCompatActivity() {

    private val fragmentOneOw =FragmentOneOw()
    private val fragmentTwoOw =FragmentTwoOw()
    private val fragmentThreeOw =FragmentThreeOw()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_oldway)

        replaceFragment(fragmentOneOw)

        val bottomNavigationView =findViewById<BottomNavigationView>(R.id.bottomNavigationOw)

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.fragmentOneOw -> replaceFragment(fragmentOneOw)
                R.id.fragmentTwoOw -> replaceFragment(fragmentTwoOw)
                R.id.fragmentThreeOw -> replaceFragment(fragmentThreeOw)
            }
            true
        }

    }

    private fun replaceFragment(fragment:Fragment){

        if(fragment!=null){

            val transaction =supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
        }

    }
}