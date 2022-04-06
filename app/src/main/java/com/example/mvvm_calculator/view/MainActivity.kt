package com.example.mvvm_calculator.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.mvvm_calculator.MyAdapter
import com.example.mvvm_calculator.R
import com.example.mvvm_calculator.model.OperatorNumber
import com.example.mvvm_calculator.viewmodel.OperatorViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.result_item.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: OperatorViewModel
    private lateinit var operatorNumber: OperatorNumber

    //Fragment:
    //载入布局
    val addFragment: Fragment = AddFragment()
    val subtractionFragment: Fragment = SubtractionFragment()
    val multiplyFragment: Fragment = MultiplyFragment()
    val divideFragment: Fragment = DivideFragment()

    private var fm: FragmentManager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        setContentView(R.layout.activity_main)

        initFragment()
        selectFragment(0)


        operatorNumber=OperatorNumber(0,0)
        viewModel= OperatorViewModel(operatorNumber)
        //初始化list
        var list:List<OperatorViewModel> = listOf(viewModel)
        //把list传进adapter
        result_item.adapter=MyAdapter(list,this)

        bt_equal.setOnClickListener{
       //     tv_result.text="${viewModel.count(et_input1.text.toString().toInt(),et_input2.text.toString().toInt())}"
        }
    }

    //添加界面
    private fun initFragment() {
        var fm = supportFragmentManager
        val transaction: FragmentTransaction = fm.beginTransaction()
        transaction.add(R.id.content, addFragment)
        transaction.add(R.id.content, subtractionFragment)
        transaction.add(R.id.content, multiplyFragment)
        transaction.add(R.id.content, divideFragment )
        transaction.commit()
    }

    private fun selectFragment(i: Int) {
        var fm = supportFragmentManager
        val transaction: FragmentTransaction = fm.beginTransaction()
        hideFragment(transaction)
        when (i) {
            0 -> {
                Log.d("setSelect", "1")
                transaction.show(addFragment)
            }
            1 -> {
                transaction.show(subtractionFragment)
            }
            2 -> {
                transaction.show(multiplyFragment)
            }
            3 -> {
                transaction.show(divideFragment)
            }
            else -> {
            }
        }
        transaction.commit()
    }

    private fun hideFragment(transaction: FragmentTransaction) {
        transaction.hide(addFragment)
        transaction.hide(subtractionFragment)
        transaction.hide(multiplyFragment)
        transaction.hide(divideFragment)
    }
}