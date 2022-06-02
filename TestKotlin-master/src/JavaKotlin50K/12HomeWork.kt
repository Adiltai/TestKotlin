package JavaKotlin50K

var myMap=HashMap<String,String>()//?=null
//var myMap2:HashMap<String,String>?=null
fun main() {
    val names= arrayOf("KG","RU","USA","TR")
    val codes= arrayOf("+996", "+7", "+1", "+90")
for (i in names.indices){
    //myMap2.put([names[i],codes[i])
    myMap.put(names[i],codes[i])

}
    println(myMap)
    println(myMap["KG"])
   // println(myMap2)

}