package com.helenacorp.android.svgshowimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_local_html.*

class LocalHtmlActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local_html)
        wvLocalHtml.loadUrl("file:///android_asset/etiquette_concer.svg")
    }
}
