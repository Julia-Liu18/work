package com.tym.calculator.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.tym.calculator.R
import com.tym.calculator.ViewModel.OperatorViewModel


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        tv_result = findViewById(R.id.tv_result)
        et_input1 = findViewById(R.id.et_input1)
        et_input2 = findViewById(R.id.et_input2)

      button.setOnClickListener {
          OperatorViewModel.Count()
      }
    }
}