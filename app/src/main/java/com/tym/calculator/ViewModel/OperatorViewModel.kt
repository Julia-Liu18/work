package com.tym.calculator.viewmodel

import androidx.databinding.ObservableField
import com.tym.calculator.model.OperatorNumber

class OperatorViewModel(var opNumber:OperatorNumber){

    val info=ObservableField(" ")
    val input1=ObservableField("${opNumber.num1}")
    val input2=ObservableField("${opNumber.num2}")

    fun count(){
        opNumber.num1=input1.get().toString().toInt()
        opNumber.num2=input1.get().toString().toInt()
        val start:Int=if(opNumber.num2<0) opNumber.num2 else 1
        val end:Int=if(opNumber.num2<0) -1 else opNumber.num2
        var output=""
        if(opNumber.num2==0){
            output="$opNumber.num1*0=0"
        }else{
            for(index in start..end){
                output+="${opNumber.num1}*$index=${opNumber.num1*index}\n"
            }
        }
        info.set(output)
    }
}