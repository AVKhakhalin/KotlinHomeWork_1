package ru.geekbrains.lessions2345.kotlinhomework_1

import android.content.Context
import android.content.Intent

object TaskFiveB {
    private var fieldOne : String = "Первое поле"
    fun getFieldOne() : String {
        return fieldOne
    }
    fun setFieldOne(newFieldOne : String) {
        fieldOne = newFieldOne
    }
    private var fieldTwo : Int = 2
    fun getFieldTwo() : Int {
        return fieldTwo
    }
    fun setFieldTwo(newFieldTwo : Int) {
        fieldTwo = newFieldTwo
    }

    fun copy() : TaskFiveB {
        var newTaskFiveB : TaskFiveB = TaskFiveB
        newTaskFiveB.setFieldOne(fieldOne)
        newTaskFiveB.setFieldTwo(fieldTwo)
        return newTaskFiveB
    }
}