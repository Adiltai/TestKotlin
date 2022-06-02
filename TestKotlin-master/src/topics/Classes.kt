package topics

import java.beans.beancontext.BeanContextChild

fun main(){

    val child=Person("Child","Chgild",2)
    val p1=Person("Piter","Jones",32,child)
    println(p1.firstName)

    val rectangle1= Rectangle(5.0,2.0)
    println("the perimeter is ${rectangle1.perimeter}")
    val rectangle2=Rectangle(4.0,2.0)
    println(rectangle1==rectangle1) //true

}
//primary Constructor -пераичныйй конструктор
class Person(val firstName:String, val lastName: String, var age:Int){
    var children: MutableList<Person> = mutableListOf() // ArrayList

    init {
        println("Person is created $firstName")
    }
//вторичный конструктор
    constructor(firstName: String,lastName: String,age: Int,child: Person):  //вторичный к-ор
        this(firstName,lastName,age){ //также внутри будет вызываться и первичный конструктор
        children.add(child)
    }
//конструктор без аргументов
    constructor(): this(
    "",
    "",
    0
)
}
//data class ключевое слово data
data class Rectangle(var height:Double,var lentgh:Double){
    var perimeter=(height+lentgh)*2

    var test=1
    get()=field+1 //this.поле
    set(value) {
        if (value<0) println("Negative value")
        field=value
    }

    fun area()=height*lentgh


}