package com.example.mvvm_calculator

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.mvvm_calculator.viewmodel.OperatorViewModel
import kotlinx.android.synthetic.main.result_item.view.*

//Adapter()传入两个参数：1、list:OperatorViewMdel的列表项集合； 2、context:MainActivity主视图的引用
class MyAdapter(var list: List<OperatorViewModel>, var context:Context) :BaseAdapter(){

    //getView()方法：返回视图，集合里的每一项与xml文件内容的绑定
    //p0:代表列表的第几行
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        //每一行的视图项绑定：
        //取出视图
        var v:View=LayoutInflater.from(context).inflate(R.layout.result_item,null)
        //取出视图的每一项
        var resultItem:OperatorViewModel=list[p0]
        //绑定
        v.result_item.text=resultItem.output
        return v
    }

    override fun getItem(p0: Int): Any {
        return list[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
       return list.size
    }

}