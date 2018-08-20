package com.example.kiarima.practice3buttonchangetextbykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_lable_and_buttons.*

class LableAndButtons : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lable_and_buttons)

        button_hi.setOnClickListener(View.OnClickListener {
            StatusMessage.text = button_hi.text
        })

        button_howareyou.setOnClickListener(View.OnClickListener {
            StatusMessage.text = button_howareyou.text
        })

        button_imfine.setOnClickListener(View.OnClickListener {
            StatusMessage.text = button_imfine.text
        })
    }
}
