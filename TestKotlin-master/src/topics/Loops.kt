package topics



fun main() {
    val score = 100
    if (score >= 90 && score <= 100)
        println("5")
    else if (score >= 70 && score < 90)
        println("4")
    else if (score >= 50 && score < 70)
        println("3")
    else if (score >= 30 && score < 50)
        println("2")
    else if (score >= 0 && score < 30)
        println("1")

    val a = 5
    val b = 3

    val maxValue = if (a > b) {
        println("a is bigger")
        a
    } else
        b
    println("maxValue: $maxValue")

    println("Введите 4x значное число")
    var Numero: Int = readLine().toString().toInt()
    if (Numero  in 1000..9999) {
        var sub1= Numero.toString().subSequence(0, 1).toString()
        var sub2 = Numero.toString().subSequence(1, 2).toString()
        var sum1 :Int=sub1.toInt()+sub2.toInt()
        var sub3 = Numero.toString().subSequence(2, 3).toString()
        var sub4 = Numero.toString().subSequence(3, 4).toString()
        var sum2 :Int=sub3.toInt()+sub4.toInt()
        if(sum1==sum2)
            println("true")
    }
    else
        println("Это не 4х значное число")

    var n: Int = readLine().toString().toInt()
    if (n  in 1..100) {
        if (n != 11 && n % 10 == 1)
            println("${n} год")
        else if (n % 10 in 2..4 && (n > 21 || n < 5))
            println("${n}  года")
        else println("${n}  лет")
    }
    else {
        println("Число не может быть больше 100 или меньше 1")
    }
    //for ech
    val items =listOf("apple","banana","orange") //List.Of() Java 9
    mutableListOf("apple","banana","orange") //ArrayList

    for (item in items)
        println(item)

    //while
    var index=0
    while (index<items.size){
        println("Items at $index is ${items[index]}")
        index++
    }

    //диапазоны (как в Python)
    println(5 in 3..10)
    for(i in 1..10)
    println(i)

    for (i in 1 until 10)
        println(i)
    for (i in 10 downTo 1)
    println(i)

    for (i in 0..100 step 10)
        println(i)
}