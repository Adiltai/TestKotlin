package topics

fun main(){
    val a= listOf(1,2,3,4,5)

    a.forEach{ e-> println(e)}
    println(a.map { e-> e*2 })
    println(a.filter { e->e % 2==0 })
    println(a.reduce{sum, e-> sum+e}) //sum()

    a.sortedByDescending { it }

    a.any { it>10 } //false
    a.all { it<10 } //true
    a.sum()

    val numbers= listOf(1,-3,-4,5,3,-9)
    val (positive,negative)=numbers.partition { it>0 }

    println(positive)
    println(negative)

    val result= listOf("wer","rt","w","r","rt","yyttt","tre").groupBy { it.length }
    println(result)  // HashMap or LinkedHashMap
 }