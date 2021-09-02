package ru.geekbrains.lessions2345.kotlinhomework_1

import android.util.Log

class TaskFiveC {
    val numbersArray : Array<String> = arrayOf("Один", "Два", "Три")
    val numbersList : List<String> = listOf("(1)", "(2)", "(3)")

    fun getLoop1() : String {
        var result = "getLoop1(): "
        repeat(numbersArray.size){
            result += "${numbersArray[it]} ${numbersList[it]}${if (it == numbersList.size - 1) "" else ", "}"
        }
        return result
    }

    fun getLoop2() : String {
        var result = "getLoop2(): "
        numbersArray.forEachIndexed{index, element ->
            result += "$element${if (index == numbersArray.size - 1) "; " else ", "}"
        }
        numbersList.forEachIndexed{index, element ->
            result += "$element${if (index == numbersList.size - 1) "" else ", "}"
        }
        return result
    }

    fun getLoop3() : String {
        var result = "getLoop3(): "
        var counter = 0
        for(number in numbersArray){
            result += "$number${if (counter == numbersArray.size - 1) "; " else ", "}"
            counter++
        }
        counter = 0
        for(number in numbersList){
            result += "$number${if (counter == numbersList.size - 1) "" else ", "}"
            counter++
        }
        return result
    }

    fun getLoop4() : String {
        var result = "getLoop4(): "
        for((counter, number) in numbersArray.withIndex()){
            result += "$number${if (counter == numbersArray.size - 1) "; " else ", "}"
        }
        for((counter, number) in numbersList.withIndex()){
            result += "$number${if (counter == numbersList.size - 1) "" else ", "}"
        }
        return result
    }

    fun getLoop5() : String {
        var result = "getLoop5(): "
        var counter = 0
        numbersArray.forEach { number ->
            result += "$number${if (counter == numbersArray.size - 1) "; " else ", "}"
            counter++
        }
        counter = 0
        numbersList.forEach { number ->
            result += "$number${if (counter == numbersList.size - 1) "" else ", "}"
            counter++
        }
        return result
    }

    fun getLoop6() : String {
        var result = "getLoop6(): "
        for(i in 0..numbersArray.size - 1) {
            result += "${numbersArray[i]}${if (i == numbersArray.size - 1) "; " else ", "}"
        }
        for(i in 0..numbersList.size - 1) {
            result += "${numbersList[i]}${if (i == numbersList.size - 1) "" else ", "}"
        }
        return result
    }

    fun getLoop7() : String {
        var result = "getLoop7(): "
        for(i in 0 until numbersArray.size) {
            result += "${numbersArray[i]}${if (i == numbersArray.size - 1) "; " else ", "}"
        }
        for(i in 0 until numbersList.size) {
            result += "${numbersList[i]}${if (i == numbersList.size - 1) "" else ", "}"
        }
        return result
    }

    fun getLoop8() : String {
        var result = "getLoop8(): "
        for(i in numbersArray.indices) {
            result += "${numbersArray[i]}${if (i == numbersArray.size - 1) "; " else ", "}"
        }
        for(i in numbersList.indices) {
            result += "${numbersList[i]}${if (i == numbersList.size - 1) "" else ", "}"
        }
        return result
    }

    fun getLoop9() : String {
        var result = "getLoop9(): "
        for(i in numbersArray.size - 1 downTo 0 step 1) {
            result += "${numbersArray[i]}${if (i == 0) "; " else ", "}"
        }
        for(i in numbersList.size - 1 downTo 0 step 1) {
            result += "${numbersList[i]}${if (i == 0) "" else ", "}"
        }
        return result
    }

    fun getLoop10() : String {
        var result = "getLoop10(): "
        var counter = 0
        while (counter < numbersArray.size) {
            result += "${numbersArray[counter]}${if (counter++ == numbersArray.size - 1) "; " else ", "}"
        }
        counter = 0
        while (counter < numbersList.size) {
            result += "${numbersList[counter]}${if (counter++ == numbersList.size - 1) "" else ", "}"
        }
        return result
    }
}