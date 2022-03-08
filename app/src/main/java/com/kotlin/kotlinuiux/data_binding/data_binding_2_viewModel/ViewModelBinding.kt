package com.kotlin.kotlinuiux.data_binding.data_binding_2_viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelBinding :ViewModel() {

    val message=MutableLiveData<String>()

    fun setMessage(text:String){
        message.value=text
    }

}