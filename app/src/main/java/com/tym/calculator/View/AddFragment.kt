package com.tym.calculator.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm_calculator.R
import com.tym.calculator.RecycleViewAdapter
import com.tym.calculator.model.OperatorNumber
import com.tym.calculator.viewmodel.OperatorViewModel
import kotlinx.android.synthetic.main.add_fragment.*
import kotlinx.android.synthetic.main.add_fragment.view.*
import kotlinx.android.synthetic.main.result_item.*

class AddFragment:Fragment() {

    var output = ""
    private lateinit var operatorViewModel: OperatorViewModel
    private lateinit var operatorNumber: OperatorNumber

    private var arrList: ArrayList<OperatorViewModel> = ArrayList()

    private lateinit var recyclerView: RecyclerView

    private lateinit var adapter: RecycleViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        operatorViewModel = ViewModelProvider(requireActivity()).get(OperatorViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        /*  //Livedata:
        //通过ViewModelProvider创建operatorViewModel
        ViewModelProvider(this)
        operatorViewModel= ViewModelProvider(this).get(OperatorViewModel::class.java)
        result_item.text=operatorViewModel.output .toString()
        //设置观察
        operatorViewModel.output.observe(viewLifecycleOwner) {
            result_item.text = it.toString()
        }*/

        return inflater.inflate(R.layout.add_fragment, container, false)
    }

    /* private fun initResult() {
        operatorNumber=OperatorNumber(0,0)
        arrList.add(OperatorViewModel(operatorNumber ))
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.add_recycle_view
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
        //设置观察
        operatorViewModel.output.observe(viewLifecycleOwner) {
            operatorNumber.operator == "+"
        }
    }
}