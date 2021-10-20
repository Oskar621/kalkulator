package com.example.kalkulator

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        var LiczbaPierwsza = 0
        var LiczbaDruga = 0
        var wynik = 0
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        findViewById<Button>(R.id.button0).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = findViewById<TextView>(R.id.textView).text.toString() +  "0"
        }
        findViewById<Button>(R.id.button1).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = findViewById<TextView>(R.id.textView).text.toString() +  "1"
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = findViewById<TextView>(R.id.textView).text.toString() +  "2"
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = findViewById<TextView>(R.id.textView).text.toString() +  "3"
        }
        findViewById<Button>(R.id.button4).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = findViewById<TextView>(R.id.textView).text.toString() +  "4"
        }
        findViewById<Button>(R.id.button5).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = findViewById<TextView>(R.id.textView).text.toString() +  "5"
        }
        findViewById<Button>(R.id.button6).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = findViewById<TextView>(R.id.textView).text.toString() + "6"
        }
        findViewById<Button>(R.id.button7).setOnClickListener {
            findViewById<android.widget.TextView>(com.example.kalkulator.R.id.textView).text = findViewById<TextView>(R.id.textView).text.toString() +  "7"
        }
        findViewById<Button>(R.id.button8).setOnClickListener {
            findViewById<android.widget.TextView>(com.example.kalkulator.R.id.textView).text = findViewById<TextView>(R.id.textView).text.toString() +  "8"
        }
        findViewById<Button>(R.id.button9).setOnClickListener {
            findViewById<android.widget.TextView>(com.example.kalkulator.R.id.textView).text = findViewById<TextView>(R.id.textView).text.toString() +  "9"
        }
        findViewById<Button>(R.id.dzielenie).setOnClickListener {
            LiczbaPierwsza = findViewById<TextView>(R.id.textView).text.toString().toInt()
            findViewById<TextView>(R.id.textView).text = ""
        }
        findViewById<Button>(R.id.rownasie).setOnClickListener {
            LiczbaDruga = findViewById<TextView>(R.id.textView).text.toString().toInt()
            wynik = LiczbaDruga + LiczbaPierwsza
            findViewById<TextView>(R.id.textView).text = wynik.toString()
            wynik = 0
        }
        findViewById<Button>(R.id.rownasie).setOnClickListener {
            LiczbaPierwsza = findViewById<TextView>(R.id.textView).text.toString().toInt()
            findViewById<TextView>(R.id.textView).text = ""
        }
        findViewById<Button>(R.id.rownasie).setOnClickListener {
            LiczbaPierwsza = findViewById<TextView>(R.id.textView).text.toString().toInt()
            findViewById<TextView>(R.id.textView).text = ""
        }
        findViewById<Button>(R.id.rownasie).setOnClickListener {
            LiczbaPierwsza = findViewById<TextView>(R.id.textView).text.toString().toInt()
            findViewById<TextView>(R.id.textView).text = ""
        }
        findViewById<Button>(R.id.wyczysc).setOnClickListener {
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