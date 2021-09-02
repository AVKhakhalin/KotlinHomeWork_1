package ru.geekbrains.lessions2345.kotlinhomework_1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var button: Button? = null
    var kotlinDataClass: TaskFiveA = TaskFiveA(5, "пять")
    var textOutput: TextView? = null

    var taskFiveB: TaskFiveB = TaskFiveB
    var newTaskFiveB = taskFiveB.copy()

    val TAG: String = "mylogs"
    var taskFiveC: TaskFiveC = TaskFiveC()

    override fun onCreate(savedInstatnceState: Bundle?) {
        super.onCreate(savedInstatnceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        if (button != null) {
            button?.setOnClickListener(this)
        }

        textOutput = findViewById(R.id.textview)
        if (textOutput != null) {
            textOutput?.setText(
                "Значение первого поля dataClass:\n ${kotlinDataClass.first}\n" +
                        "Значение второго поля dataClass:\n ${kotlinDataClass.second}\n\n" +
                        "Значение полей класса object:\n ${taskFiveB.getFieldOne()}, ${taskFiveB.getFieldTwo()}\n" +
                        "Значение полей копии класса object:\n ${newTaskFiveB.getFieldOne()}, ${newTaskFiveB.getFieldTwo()}\n"
            )
        }
    }

    override fun onClick(view: View?) {
        if ((view != null) && (view?.id == R.id.button)) {
            Toast.makeText(
                view.context,
                "Нажали на кнопку и вывели логи различных циклов",
                Toast.LENGTH_LONG
            ).show()
            Log.d(TAG, taskFiveC.getLoop1())
            Log.d(TAG, taskFiveC.getLoop2())
            Log.d(TAG, taskFiveC.getLoop3())
            Log.d(TAG, taskFiveC.getLoop4())
            Log.d(TAG, taskFiveC.getLoop5())
            Log.d(TAG, taskFiveC.getLoop6())
            Log.d(TAG, taskFiveC.getLoop7())
            Log.d(TAG, taskFiveC.getLoop8())
            Log.d(TAG, taskFiveC.getLoop9())
            Log.d(TAG, taskFiveC.getLoop10())
        }
    }
}