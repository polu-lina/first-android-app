package com.example.firstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState?.run {
            val newValue = textView.text.toString().toInt() + 1
            putString("KEY", newValue.toString())
        }

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        textView.text = savedInstanceState?.getString("KEY")
    }

    fun squareNumber(view: View) {
        val squareIntent = Intent(this, SecondActivity::class.java)

        val currentValue = textView.text.toString()
        val newValue = currentValue.toInt()
        squareIntent.putExtra(SecondActivity.TOTAL_COUNT, newValue)

        startActivity(squareIntent)
    }
}