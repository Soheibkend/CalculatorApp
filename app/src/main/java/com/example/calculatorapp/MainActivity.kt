package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorapp.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnAc.setOnClickListener{
         binding.inputTv.text = ""
         binding.outputTv.text = ""
        }

        binding.btn0.setOnClickListener {
            binding.inputTv.append("0")
        }

        binding.btn1.setOnClickListener {
            binding.inputTv.append("1")
        }

        binding.btn2.setOnClickListener {
            binding.inputTv.append("2")
        }

        binding.btn3.setOnClickListener {
            binding.inputTv.append("3")
        }

        binding.btn4.setOnClickListener {
            binding.inputTv.append("4")
        }

        binding.btn5.setOnClickListener {
            binding.inputTv.append("5")
        }

        binding.btn6.setOnClickListener {
            binding.inputTv.append("6")
        }

        binding.btn7.setOnClickListener {
            binding.inputTv.append("7")
        }

        binding.btn8.setOnClickListener {
            binding.inputTv.append("8")
        }

        binding.btn9.setOnClickListener {
            binding.inputTv.append("9")
        }

        binding.btnPlus.setOnClickListener {
            binding.inputTv.append(" + ")
        }

        binding.btnMinus.setOnClickListener {
            binding.inputTv.append(" - ")
        }

        binding.btnDivide.setOnClickListener {
            binding.inputTv.append(" / ")
        }

        binding.btnDot.setOnClickListener {
            binding.inputTv.append(".")
        }

        binding.btnMultiplication.setOnClickListener {
            binding.inputTv.append(" * ")
        }

        binding.btnStartBracket.setOnClickListener {
            binding.inputTv.append(" ( ")
        }

        binding.btnEndBracket.setOnClickListener {
            binding.inputTv.append(" ) ")
        }

        binding.btnEqual.setOnClickListener {
            val expressrion = ExpressionBuilder(binding.inputTv.text.toString()).build()
            val result = expressrion.evaluate()
            val longResult = result.toLong()

            if (result == longResult.toDouble()) {
                binding.outputTv.text = longResult.toString()
            } else {
                binding.outputTv.text = result.toString()
            }
        }
    }
}