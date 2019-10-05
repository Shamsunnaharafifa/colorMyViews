package com.example.afifa123.colormyviews

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners(){
        val clickableViews : List<View> = listOf(boxOne, box_two_text,
        box_three_text, box_four_text, box_five_text,constraintLayout,
            red_button,yellow_button,green_button)

        for (item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun makeColored(view: View?) {
        if (view != null) {
            when(view.id){
                R.id.boxOne -> view.setBackgroundResource(android.R.color.darker_gray)
                R.id.box_two_text -> view.setBackgroundResource(android.R.color.holo_orange_light)

                R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
                R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
                R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

                R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red_color)
                R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow_color)
                R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green_color)

                else -> view.setBackgroundResource(android.R.color.background_light)

            }
        }
    }
}
