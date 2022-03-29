package com.tym.calculator.ViewModel

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.tym.calculator.Model.OperatorNumber

class OperatorViewModel(val opNumber:OperatorNumber){

    val info=ObservableField<String>("${Count()}")

    fun Count(){
        var num1:Int
        var num2:Int
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
        info.set(output)
    }
}