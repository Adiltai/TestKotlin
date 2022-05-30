package JavaKotlin50K

fun main() {
    var sum:Int=0
    var count:Int=0
    for (i in 1..99 step 1){
        if (i%2==0) {
            sum+=i
            count++
        }
    }
    println("сумма четных чисел: $sum")
    println("Количество четных чисе: $count")
    println("-----------------------------------------------")
    println("Введите число")
    val num: Int = readLine().toString().toInt()
        var flag = false
        for (i in 2..num / 2) {
            // условие для непростого числа
            if (num % i == 0) {
                flag = true
                break
            }
        }

        if (!flag)
            println("$num это простое число")
        else
            println("$num это не простое число")
            println("$num new branch developer")
            println("$num new branch developer")
    println("$num new branch developer")
    println("$num new branch developer")
    println("$num new branch developer")
            println("$num new branch developer")

    }
