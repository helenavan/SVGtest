package com.helenacorp.android.svgshowimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mindorks.*

class MindorksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mindorks)
        wvMindorks.loadUrl("https://mindorks.com/")
    }
}
