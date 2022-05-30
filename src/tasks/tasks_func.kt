package tasks

fun main(){
    val age:Int=21
    val exPeriance:Int=1
    val autoModel:String="Audi"



    val user1=Users("Roma",44,8)
    val user2=Users("Li",24,8)

    val getUser= getCar(user2)
    println(getUser)
    //println("Ползователь ${getUser.name} лет. Его стаж: ${getUser.age} . Статус: ${getUser})
    val car1=Car("BMW", 1200.0)
    val car2=Car("Honda",1300.0)
    val getModel=getCarModel(car1,user1)
    println(getModel)
}
//fun getCar(age: Int, ex_per: Int):Boolean {
//    return age>=21 && ex_per>=2

fun getCar(user2:Users) : Boolean {
    return user2.age >= 21 && user2.ex_per >= 2
}

//}
//fun getCarModel(age: Int, ex_per: Int, modelCar:String):Boolean {
//    return age>=26 && ex_per>=6 && (modelCar=="Audi" || modelCar=="BMW")
//}
fun getCarModel(car1:Car,user1:Users):Boolean{
    return user1.age>=26 && user1.ex_per>=6 && (car1.modelCar=="Audi" || car1.modelCar=="BMW")
}
data class Users(val name: String, val age:Int, val ex_per:Int)

data class Car(val modelCar: String, val cost:Double)