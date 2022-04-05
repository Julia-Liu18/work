package com.example.mvvm_calculator.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvm_calculator.MyAdapter
import com.example.mvvm_calculator.R
import com.example.mvvm_calculator.model.OperatorNumber
import com.example.mvvm_calculator.viewmodel.OperatorViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.result_item.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: OperatorViewModel
    private lateinit var operatorNumber: OperatorNumber

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operatorNumber=OperatorNumber(0,0)
        viewModel= OperatorViewModel(operatorNumber)
        //初始化list
        var list:List<OperatorViewModel> = listOf(viewModel)
        //把list传进adapter
        result_item.adapter=MyAdapter(list,this)

        bt_equal.setOnClickListener{
       //     tv_result.text="${viewModel.count(et_input1.text.toString().toInt(),et_input2.text.toString().toInt())}"
        }
    }
}