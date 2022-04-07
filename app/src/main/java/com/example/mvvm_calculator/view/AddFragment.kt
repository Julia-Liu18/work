package com.example.mvvm_calculator.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mvvm_calculator.ListAdapter
import com.example.mvvm_calculator.R
import com.example.mvvm_calculator.model.OperatorNumber
import com.example.mvvm_calculator.viewmodel.OperatorViewModel
import kotlinx.android.synthetic.main.add_fragment.*
import kotlinx.android.synthetic.main.add_fragment.*
import kotlinx.android.synthetic.main.bottom_navbar.*

class AddFragment :Fragment() {

  /*  private lateinit var operatorNumber:OperatorNumber

    var arrList:ArrayList<OperatorViewModel> = ArrayList()*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

      /*  initResult()
        val mainActivity=MainActivity()
        add_listview.adapter=ListAdapter(mainActivity,arrList)*/

        return inflater.inflate(R.layout.add_fragment,container,false)
    }

   /* private fun initResult() {
            operatorNumber=OperatorNumber(0,0)
            arrList?.add(OperatorViewModel(operatorNumber ))
    }*/
}