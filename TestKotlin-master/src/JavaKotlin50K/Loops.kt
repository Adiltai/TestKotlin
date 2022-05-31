package JavaKotlin50K

fun main(){
//    Array

    //element 1,2,3,4,5
    //index   0,1,2,3,4

    val myArray = arrayOf(1,2,3,4,5)

    println(myArray[0])
    println(myArray[3])

    //ArrayList

    val myArrayList=ArrayList<String>()
    myArrayList.add("Kotlin")
    myArrayList.add("Java")
    myArrayList.add("Dart")

    myArrayList.add(1,"Python")
    myArrayList.remove("Kotlin")

    println(myArrayList)
    println(myArrayList.size)

}