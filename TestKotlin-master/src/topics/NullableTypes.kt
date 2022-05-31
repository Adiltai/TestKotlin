package topics


var value: String? = null
lateinit var lateValue: String
fun main() {
    //value =null
    //value ="Kotlin"

    //Safe call operator (.?)
    //println(value?.length)

    //Safe call with let (?.let)

    value?.let {
        //println(it.length)
    }

    //Elvis operator (?:)

    val length =if(value !=null){
        value!!.length
    } else {
        -1
    }
    val length2= value?.length ?: -1

    //println(length2)

    //Non null assertion operator (!!)

    //'lateinit' keyword
    lateValue = "Java"
    //println(lateValue.length)

//dom задание 3 урок
    println("Введите 1е число")
    var a: Int= readLine().toString().toInt()
    println("Введите 2е число")
    var b: Int= readLine().toString().toInt()
    println("Ответ а+b= ${a+b}")
    println("Введите 1е число")
    a = readLine().toString().toInt()
    println("Введите 2е число")
    b = readLine().toString().toInt()
    println("Ответ а-b= ${a-b}")
}

