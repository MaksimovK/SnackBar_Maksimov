package com.example.smaclbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.support.design.widget.Snackbar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var snackbar: Snackbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        snackbar = Snackbar.make(view, "Hello World!", Snackbar.LENGTH_LONG)

        snackbar.setAction("Next...", View.OnClickListener {
            val toast = Toast.makeText(applicationContext,"Next clicked!", Toast.LENGTH_SHORT).show()
        }).show()
    }
}