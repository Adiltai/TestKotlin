package tasks

fun main(){
    //data input
    val a:Int=23
    val b:Int=111

    //find maxNumber
    val maxNumber:Int =getMaxNumber(a,b)

    // data output
    println(maxNumber)
    
    val email="snowbarsy_996@mail.ru"
    //val result= emailIsCorrect(email)
    val result = emailIsNotCorrect(email)
    println(result)
}

fun getMaxNumber(a:Int, b:Int):Int { //getMaxNumber.a getMaxNumber.b
    return if (a>b) //getMaxNumber
        a
    else
        b

}
fun emailIsCorrect(email:String):Boolean{
    return  (email.contains('@')&& email.contains('.'))
}
fun emailIsNotCorrect(email:String):Boolean{
    return !emailIsCorrect(email)
}