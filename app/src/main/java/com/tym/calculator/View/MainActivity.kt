package com.tym.calculator.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm_calculator.R
import com.tym.calculator.RecycleViewAdapter
import com.tym.calculator.model.OperatorNumber
import com.tym.calculator.viewmodel.OperatorViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_navbar.*

class MainActivity : AppCompatActivity() {

    var rvdapter: RecycleViewAdapter? = null
    var list: ArrayList<OperatorViewModel>? = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Fragment:
        //隐藏标题栏
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        bt_add.setOnClickListener{
            replace(AddFragment())
        }

        bt_sub.setOnClickListener{
            replace(SubtractionFragment())
        }

        bt_mul.setOnClickListener{
            replace(MultiplyFragment())
        }

        bt_div.setOnClickListener{
            replace(DivideFragment())
        }

        /*operatorNumber=OperatorNumber(0,0)
        viewModel= OperatorViewModel(operatorNumber)
        //初始化list
        var list:List<OperatorViewModel> = listOf(viewModel)
        //把list传进adapter
        result_item.adapter= ListAdapter(arrlist,this)

        bt_equal.setOnClickListener{
        }*/
    }

    private fun replace(fragment: Fragment){
        val fragmentManager=supportFragmentManager
        val transaction=fragmentManager.beginTransaction()
        transaction.replace(R.id.content,fragment)
        transaction.commit()
    }
}