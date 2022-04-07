package com.example.mvvm_calculator

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.mvvm_calculator.viewmodel.OperatorViewModel
import kotlinx.android.synthetic.main.result_item.view.*

class ListAdapter(var context: Context,var arrList: ArrayList<OperatorViewModel>) :BaseAdapter(){

    //p0:代表列表的第几行
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        //获取每一行item的显示内容
        var view: View?=null
        var myHolder: MyHolder?=null
        if (p1==null){
            myHolder= MyHolder()
            view=LayoutInflater.from(context).inflate(R.layout.result_item,null)
            myHolder.resultItem=view.result_item
            view.tag=myHolder
        }else{
            view=p1
            myHolder = view.tag as MyHolder
        }
        myHolder.resultItem.text=arrList.get(p0).output
        return view!!
    }

    override fun getItem(p0: Int): Any {
        return arrList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
       return arrList.size
    }
}

class MyHolder {
    lateinit var num1: TextView
    lateinit var num2: TextView
    lateinit var resultItem: TextView
}
