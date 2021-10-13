package com.example.kalkulator

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        findViewById<Button>(R.id.button_first).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "0"
        }
        findViewById<Button>(R.id.button1).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "1"
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "2"
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "3"
        }
        findViewById<Button>(R.id.button4).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "4"
        }
        findViewById<Button>(R.id.button5).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "5"
        }
        findViewById<Button>(R.id.button6).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "6"
        }
        findViewById<Button>(R.id.button7).setOnClickListener {
            findViewById<android.widget.TextView>(com.example.kalkulator.R.id.textView).text = "7"
        }
        findViewById<Button>(R.id.button8).setOnClickListener {
            findViewById<android.widget.TextView>(com.example.kalkulator.R.id.textView).text = "8"
        }
        findViewById<Button>(R.id.button9).setOnClickListener {
            findViewById<android.widget.TextView>(com.example.kalkulator.R.id.textView).text = "9"
        }
        findViewById<Button>(R.id.plus).setOnClickListener {
            findViewById<TextView>(R.id.wynik1).text = findViewById<TextView>(R.id.textView).text
            findViewById<TextView>(R.id.textView).text = ""
        }


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}