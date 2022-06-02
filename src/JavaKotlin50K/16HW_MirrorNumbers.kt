package JavaKotlin50K

import topics.testString

//Вывести число, которое является зеркальным отображением последовательности цифр заданного числа, например,
// задано число 123, вывести 321.
fun main() {
    println("Введите число: ")
    var num = readLine().toString()
    println(num.reversed())


    println("Введите число: ")
    var num2 = readLine().toString().toInt()
    var reversed = 0
    while (num2 != 0) {
        val digit = num2 % 10
        reversed = reversed * 10 + digit
        num2 /= 10
    }
    println("Reversed Number: $reversed")


    println("Function Reversed Number:")  //вызов функции
    println(revNumber(num3=reversed))
}
//функиця  reverse
fun revNumber(num3:Int):Int{
    var reversed2 = 0
    var numm=num3
    while (numm != 0) {
        val digit = numm % 10
        reversed2 = reversed2 * 10 + digit
        numm /= 10
    }
    return reversed2
    //println("Reversed Number: $numm")
}

