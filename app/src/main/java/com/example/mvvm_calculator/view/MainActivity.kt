package com.example.mvvm_calculator.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvm_calculator.R
import com.example.mvvm_calculator.model.OperatorNumber
import com.example.mvvm_calculator.viewmodel.OperatorViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: OperatorViewModel
    private lateinit var operatorNumber: OperatorNumber

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operatorNumber=OperatorNumber(0,0)
        viewModel= OperatorViewModel(operatorNumber)

        bt_equal.setOnClickListener{
            tv_result.text="${viewModel.count(et_input1.text.toString().toInt(),et_input2.text.toString().toInt())}"
        }
    }
}