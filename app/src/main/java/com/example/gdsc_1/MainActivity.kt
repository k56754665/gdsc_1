package com.example.test7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gdsc_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bindings = arrayOf(binding.btn1, binding.btn2, binding.btn3, binding.btn4, binding.btn5, binding.btn6, binding.btn7, binding.btn8, binding.btn9)

        for (i: Int in 0 until bindings.size) {
            bindings[i].setOnClickListener {
                binding.myText.text = bindings[i].text
            }
        }
    }
}
