package com.tym.calculator.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tym.calculator.Model.OperatorNumber
import com.tym.calculator.R
import com.tym.calculator.ViewModel.OperatorViewModel
import com.tym.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mBinding:ActivityMainBinding
    lateinit var mViewModel: OperatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val opNumber=OperatorNumber()      //Model
        mViewModel=OperatorViewModel(opNumber)     //ViewModel
        mBinding.vm=mViewModel    //Binding

    }
}