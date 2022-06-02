package JavaKotlin50K
//Выведите на экран все положительные делители натурального числа и подсчитать количество делителей, введённого пользователем с клавиатуры.
fun main() {
    var count = 0
    println("Введите число: ")
    var n: Int = readLine().toString().toInt()
    if(n < 1) {
        println("Введено не натуральное число")
        return
    }
    System.out.print("Число $n  делится на : " )
    var i :Int=1
    for (i in 1..n step 1)
    if(n % i == 0){
            count++
            System.out.print("$i   ")
        }
    println("Количество делителей : $count")
}
