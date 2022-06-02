package topics

fun main(){
    println(testSimple(x=3,y=10)) //10
    println(testString(x=10))

    //testNamedArgument(x=5, y=4, z=2 )
    //testDefaultArgument(y=1)
    testNamedArgument(x = 3, y = 5, z=2 )

    printEven(1,2,3,4,5,6,7,8)
    println("PrintEven")
    printEven(*intArrayOf(1,2,3,4,5),6,7,8,9,10)

}


fun testSimple(x:Int,  y:Int)=x + y

fun testString(x:Int):String{
    return "String is $x"
}

fun testNamedArgument(x:Int, y:Int, z:Int ): List<Int>{
    return listOf(x,y,z)
}
//void
fun testDefaultArgument(x:Int=1, y:Int=2 )  {
    println(x+y)
}
/*    From Kotlin coans:

        public String foo(String name, int number, boolean toUpperCase){
    return (toUpperCase ? name.toUpperCase() : name)+number;
}
public String foo(String name, int number){
    return foo(name, number, false);
}

public String foo(String name, boolean toUpperCase){
    return foo(name, 42 , toUpperCase);
}

public String foo(String name){
    return foo(name, 42);
}*/

fun foo(name: String, number: Int=42, toUpperCase: Boolean=false){
    (if (toUpperCase) name.toUpperCase() else name)+number
}

//vararg
fun printEven(vararg numbers:Int){
    numbers.forEach { e-> if (e%2==0) println(e) }
}



