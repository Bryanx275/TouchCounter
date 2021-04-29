package com.bryancollections.touchcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // count for number of clicks
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTouch(view: View) {
        // increment count
        counter++
        // locate testview and update the label
        val textview = findViewById(R.id.textView) as TextView
        textview.text = "You clicked $counter times okay! "
    }
}