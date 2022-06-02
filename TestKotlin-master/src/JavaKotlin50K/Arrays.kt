package JavaKotlin50K

fun main (){
    //for loop


   /* for(i in 0..10 step 2) {  //continue отменяет данную позицию и продолжает дальше//break  остановка до данной позиции //downTo 0 step 2 or 3

        println("*")
    }*/

    val names= arrayListOf("Kotlin","Java","Dart")
    for(i in 0 until names.size) {
        println(names[i])
    }

    for(i in 0..10 step 2) {  //continue отменяет данную позицию и продолжает дальше//break  остановка до данной позиции //downTo 0 step 2 or 3

        if (i == 6) break
        println(i)
    }

    for (name in names){
        println(name)
    }

    names.forEach { println(it) }

    names.forEachIndexed { index, name ->
        println("$index $name")
    }
    println("----------------------------------------")

    //while



    var j=11
    while (j<=10){
        println("while $j")
        j++
    }



    println("----------------------------------------")
    //do while

    var k=11

    do{
        println("do while $k")
        k++
    }while(k<=10)



}
