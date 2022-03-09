package com.kotlin.kotlinuiux.data_binding.data_binding_2way_1way

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.*

object RepositoryClass {


    private val fruitsName: List<String> = listOf("aa","bb","cc","dd","ee")

    private val _currentRandomFruitName=MutableLiveData<String>() // mutablelivedata can be change
    val currentRandomFruitName: LiveData<String> // live data we expose to outside because it can't be changed
        get() = _currentRandomFruitName

    init {
        _currentRandomFruitName.value= fruitsName.first() // return first fruit
    }

    fun getRandomFruitName():String{
        val random = Random()
        return  fruitsName[random.nextInt(fruitsName.size)] // return random fruit
    }
    fun changeRandomFruitName(){
        _currentRandomFruitName.value= getRandomFruitName() // return first fruit

    }



}