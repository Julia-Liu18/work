package com.tym.calculator.ViewModel

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModel

class OperatorViewModel :ViewModel(){

    private lateinit var button: Button
    private lateinit var tv_result: TextView
    private lateinit var et_input1: EditText
    private lateinit var et_input2: EditText

    fun Count(){
        val num1:Int=et_input1.text.toString().toInt()
        val num2:Int=et_input2.text.toString().toInt()
        val start:Int=if(num2<0) num2 else 1
        val end:Int=if(num2<0) -1 else num2
        var output=""
        if(num2==0){
            output="$num1*0=0"
        }else{
            for(index in start..end){
                output+="$num1*$index=${num1*index}"
            }
        }
        tv_result.text=output
    }
}