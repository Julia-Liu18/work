package com.tym.calculator.viewmodel

import androidx.databinding.ObservableField
import com.tym.calculator.model.OperatorNumber

class OperatorViewModel(var opNumber:OperatorNumber){

    val info=ObservableField(" ")
    val input1= ObservableField("${opNumber.num1}")
    val input2= ObservableField("${opNumber.num2}")

    fun count(num1:Int,num2:Int){
        val start:Int=if(num2<0) num2 else 1
        val end:Int=if(num2<0) -1 else num2
        var output=""
        if(num2==0){
            output="$num1*0=0"
        }else{
            for(index in start..end){
                output+="${num1}*$index=${num1*index}\n"
            }
        }
        info.set(output)
    }
}