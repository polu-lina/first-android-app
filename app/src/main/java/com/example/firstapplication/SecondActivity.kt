package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.lang.Math.pow

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showSquareNumber()
    }

    fun showSquareNumber(){
        val currentNumber = intent.getIntExtra(TOTAL_COUNT, 0)

        textView_square.text = (currentNumber * currentNumber).toString()
    }

    companion object {

        const val TOTAL_COUNT = "total_count"

    }
}