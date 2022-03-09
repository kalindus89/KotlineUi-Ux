package com.kotlin.kotlinuiux.data_binding.data_binding_2way_1way

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.Bindable
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kotlin.kotlinuiux.R
import com.kotlin.kotlinuiux.data_binding.data_binding_2_viewModel.ViewModelBinding
import com.kotlin.kotlinuiux.databinding.ActivityDatabindingViewModelBinding
import com.kotlin.kotlinuiux.databinding.ActivityTwowayOneWayMmvmactivityBinding

class TwowayOneWayMMVMActivity : AppCompatActivity() {

    //  private lateinit var binding: ActivityTwowayOneWayMmvmactivityBinding
    //  private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* binding= ActivityTwowayOneWayMmvmactivityBinding.inflate(layoutInflater)
         setContentView(binding.root)

         mainViewModel= ViewModelProvider(this).get(MainViewModel::class.java)
         binding.mainViewModel=mainViewModel
         binding.lifecycleOwner =this // to trigger changes in livedata in viewmodel to bind with xml

         mainViewModel.editTextContent.observe(this) {
             Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
         }*/

        setContentView(R.layout.activity_twoway_one_way_mmvmactivity)

        val binding = DataBindingUtil.setContentView<ActivityTwowayOneWayMmvmactivityBinding>(
            this,
            R.layout.activity_twoway_one_way_mmvmactivity
        )

        val mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.lifecycleOwner = this
        binding.mainViewModel = mainViewModel

        mainViewModel.editTextContent.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }


}
