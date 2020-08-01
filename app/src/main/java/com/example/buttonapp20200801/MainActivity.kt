package com.example.buttonapp20200801

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flag = false

        button.setOnClickListener {
            flag = if (flag) {
                textView.text = getString(R.string.hello)
                false
            } else {
                textView.text = getString(R.string.world)
                true
            }
        }
    }
}