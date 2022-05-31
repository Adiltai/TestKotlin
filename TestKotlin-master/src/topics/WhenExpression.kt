package topics

import java.lang.Math.sqrt

fun main() {
    val score = 200
    when (score) {
        in 90..100 -> println("5")
        in 70..89 -> println("4")
        in 50..69 -> println("3")
        in 30..49 -> println("2")
        in 0..29 -> println("1")
        else -> println("score is invalid")
    }
    when {
        3<2 -> println("3>2")
        "string".length ==6 -> println("length 6")
        2>3 -> println("2>3")
        else -> println("else called")
    }
    val a = 5
    val b = 3

    val maxValue = when (a > b) {
        true-> a
        false-> b
    }
    println("maxValue: $maxValue")


//задание по месяцам
    println("Введите число месяца: ")
    val mon: Int = readLine().toString().toInt()
    when (mon) {
        1 -> println("Месяц 1 - дней 31")
        2 -> println("Месяц 2 - дней 28-29")
        3 -> println("Месяц 3 - дней 31")
        4 -> println("Месяц 4 - дней 30")
        5 -> println("Месяц 5 - дней 31")
        6 -> println("Месяц 6 - дней 30")
        7 -> println("Месяц 7 - дней 31")
        8 -> println("Месяц 8 - дней 31")
        9 -> println("Месяц 9 - дней 30")
        10 -> println("Месяц 10 - дней 31")
        11 -> println("Месяц 11 - дней 30")
        12 -> println("Месяц 12 - дней 31")
        else -> println("${mon}  is invalid")
    }

//задание по координатам:определить принадлежит ли данная точка кругу
    println("Введите координаты х: ")
    val x: Double = readLine().toString().toDouble()
    println("Введите координаты y: ")
    val y: Double = readLine().toString().toDouble()
    println("Введите радиус круга: ")
    val r: Double = readLine().toString().toDouble()

    val h= sqrt(x*x+y*y)
    when {
        h>r -> println("точка не принадлежит кругу")
        else -> println("точка  принадлежит кругу")
    }

}