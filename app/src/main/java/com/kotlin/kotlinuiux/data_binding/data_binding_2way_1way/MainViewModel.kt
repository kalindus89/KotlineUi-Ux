package com.kotlin.kotlinuiux.data_binding.data_binding_2way_1way

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//Observable only for two way databinding
class MainViewModel : ViewModel(), Observable {

    val currentRandomFruitName: LiveData<String>
        get() = RepositoryClass.currentRandomFruitName

    fun onChangeRandomFruitClick() = RepositoryClass.changeRandomFruitName()






    //for two way data binding (note: play)
    @Bindable
    val editTextContent=MutableLiveData<String>() // here we have to use mutable livedata. otherwise we can't trigger the changes

    private val _displayEdittextContent=MutableLiveData<String>()
    val displayEdittextContent: LiveData<String>
        get() = _displayEdittextContent

    fun onDisplayEditTextContentClick(){
        _displayEdittextContent.value=editTextContent.value

    }

    fun onSelectRandomEditTextFruitName(){
        editTextContent.value=RepositoryClass.getRandomFruitName()
    }



    //for two way databinding only

    private val callbacks: PropertyChangeRegistry by lazy { PropertyChangeRegistry()}

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        callbacks.add(callback)
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        callbacks.remove(callback)
    }


}