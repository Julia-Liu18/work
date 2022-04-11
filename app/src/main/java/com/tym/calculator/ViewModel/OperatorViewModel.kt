package com.tym.calculator.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tym.calculator.model.OperatorNumber

class OperatorViewModel(val operatorNumber: OperatorNumber):ViewModel(){

     var output= MutableLiveData<String>()

    init {
        output.value=" "
    }

    //乘法
    fun  multiply(num1: Int,num2: Int):String{
        output.value="$num1*$num2=${num1*num2}\n"
        return output.value.toString()
    }
    //除法
    fun divide(num1: Int,num2:Int):String{
        output.value="$num1/$num2=${num1*num2}\n"
        return output.value.toString()
    }
    //加法
    fun add(num1: Int,num2:Int):String{
        output.value="$num1+$num2=${num1*num2}\n"
        return output.value.toString()
    }
    //减法
    fun subtraction(num1: Int,num2:Int):String{
        output.value="$num1-$num2=${num1*num2}\n"
        return output.value.toString()
    }
}