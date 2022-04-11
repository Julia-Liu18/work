package com.tym.calculator

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm_calculator.R
import com.tym.calculator.model.OperatorNumber
import com.tym.calculator.viewmodel.OperatorViewModel
import kotlinx.android.synthetic.main.result_item.view.*

class RecycleViewAdapter : RecyclerView.Adapter<ExamViewHolder>() {

    var list:List<OperatorNumber> = mutableListOf()
        set(value){
            field=value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExamViewHolder {
        return ExamViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.result_item,parent,false))
    }

    //数据处理
    override fun onBindViewHolder(holder: ExamViewHolder, position: Int) {
       val operatorNumber= list!![position]
        holder.mText?.text="${operatorNumber.num1} ${operatorNumber.operator} ${operatorNumber.num2} = ${operatorNumber.result}"
    }

    override fun getItemCount(): Int {
        return list!!.size
    }
}

class ExamViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
    var mText:TextView?=itemView.result_item
}