package com.tym.calculator.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tym.calculator.model.OperatorNumber
import com.tym.calculator.R
import com.tym.calculator.viewmodel.OperatorViewModel
import com.tym.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mBinding:ActivityMainBinding
    lateinit var mViewModel: OperatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val opNumber=OperatorNumber(0,0)      //Model
        mViewModel=OperatorViewModel(opNumber)     //ViewModel
     //   mBinding.num=opNumber
        mBinding.vm=mViewModel    //Binding

    }
}