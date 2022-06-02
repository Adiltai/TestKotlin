package JavaKotlin50K

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType
//1) Дан массив чисел “5, -3, 15, 61, 29, 10, -2 ,7”. Найти наибольший элемент в этом массиве.
//2) Дан массив чисел "5, 13, 2, 26, 55, 100, 99, 1". Посчитать сумму элементов массива с нечетными индексами

fun main() {
   var max :Int=0

    val numbers: IntArray = intArrayOf(5, -3, 15, 61, 29, 10, -2 ,7)
    for (i in numbers.indices) {
        if (numbers[i] > max) {
            max = numbers[i]
        }
    }
println(max)

    var total :Int=0

    val numbers2: IntArray = intArrayOf(5, 13, 2, 26, 55, 100, 99, 1)
    for (i in numbers2.indices) {
        if (numbers2[i] %2!=0) {
            total+= numbers2[i]
        }
    }
    println(total)
}




