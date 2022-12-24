package com.example.lab25

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val save = findViewById<Button>(R.id.save)

        save.setOnClickListener({
          val editTextEvent = findViewById<EditText>(R.id.vevent).text
          val editTextTime = findViewById<EditText>(R.id.time).text
          val editTextDate = findViewById<EditText>(R.id.vdata).text
          val editTextPost = findViewById<EditText>(R.id.post).text

          Toast.makeText(this, " Записано! \n Событие: $editTextEvent \n Дата: $editTextDate \n Время: $editTextTime \n Заметки: $editTextPost", Toast.LENGTH_LONG).show()
        })

        val good = findViewById<RadioButton>(R.id.good)
        val bad = findViewById<RadioButton>(R.id.bad)

        good.setOnClickListener({
          val picture = findViewById<ImageView>(R.id.mood)

          picture.setImageDrawable(resources.getDrawable(R.drawable.good))
        })

        bad.setOnClickListener({
          val picture = findViewById<ImageView>(R.id.mood)

          picture.setImageDrawable(resources.getDrawable(R.drawable.sad))
        })

    }
}
