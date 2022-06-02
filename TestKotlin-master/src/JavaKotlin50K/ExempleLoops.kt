package JavaKotlin50K

fun main () {

    //прямоугольник
    for (i in 1..4 step 1) {
        for (j in 1..4 step 1) {

           // if (j<=i)
                print("* ")
        }
        println(" ")
    }
    println(" ")
    //триугольник
    for (i in 1..5 step 1) {
        for (j in 1..5 step 1) {

            if (j<=i)
                print("* ")
        }
        println(" ")
    }
}