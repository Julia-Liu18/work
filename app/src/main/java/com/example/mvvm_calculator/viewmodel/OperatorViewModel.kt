package com.example.mvvm_calculator.viewmodel

import com.example.mvvm_calculator.model.OperatorNumber

class OperatorViewModel(val operatorNumber: OperatorNumber){

    var output=""
    //乘法
    fun  multiply(num1: Int,num2: Int):String{
        output="$num1*$num2=${num1*num2}\n"
        return output
    }
    //除法
    fun divide(num1: Int,num2:Int):String{
        output="$num1/$num2=${num1*num2}\n"
        return output
    }
    //加法
    fun add(num1: Int,num2:Int):String{
        output="$num1+$num2=${num1*num2}\n"
        return output
    }
    //减法
    fun subtraction(num1: Int,num2:Int):String{
        output="$num1-$num2=${num1*num2}\n"
        return output
    }

}