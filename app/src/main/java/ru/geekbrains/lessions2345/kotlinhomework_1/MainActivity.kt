package ru.geekbrains.lessions2345.kotlinhomework_1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var button : Button? = null

    override fun onCreate(savedInstatnceState : Bundle?) {
        super.onCreate(savedInstatnceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        if (button != null) {
            button?.setOnClickListener(this)
        }
    }

    override fun onClick(view : View?) {
        if ((view != null) && (view?.id == R.id.button)) {
            Toast.makeText(view.context, "Нажали на кнопку", Toast.LENGTH_SHORT).show()
        }
    }
}