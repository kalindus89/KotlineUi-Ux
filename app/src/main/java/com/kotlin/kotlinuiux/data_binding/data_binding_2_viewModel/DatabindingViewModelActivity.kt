package com.kotlin.kotlinuiux.data_binding.data_binding_2_viewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.ViewModelProvider
import com.kotlin.kotlinuiux.R
import com.kotlin.kotlinuiux.databinding.ActivityDatabindingViewModelBinding

class DatabindingViewModelActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDatabindingViewModelBinding
    private lateinit var viewModelBinding: ViewModelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityDatabindingViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModelBinding=ViewModelProvider(this).get(ViewModelBinding::class.java)
        binding.viewModelBinding=viewModelBinding
        binding.lifecycleOwner =this // to trigger changes in livedata in viewmodel to bind with xml

     /*  viewModelBinding.message.observe(this) { text ->
            binding.getEnterText.text = text
        }

          or

        we can observe changes from XML. So no need viewModelBinding.observe
        */

        binding.editText.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(char: CharSequence?, p1: Int, p2: Int, p3: Int) { }

            override fun onTextChanged(char: CharSequence?, p1: Int, p2: Int, p3: Int) {

                viewModelBinding.setMessage(char.toString())
            }

            override fun afterTextChanged(p0: Editable?) { }


        })


    }
}