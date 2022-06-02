package yandex

fun main () {
    //AAAABBBCCXYZDDDEEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBB  ->A4B3C2XYZD3E4F3A6B25
    println(countLetters("AAAABBBCCXYZDDDEEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBB"))

}

fun countLetters(str:String):String {
    var currentLetter=str[0]
    var count=1
    var result=""

    for (letter in str.substring(1)){
        if (currentLetter==letter){
           count++
        } else{
            if (count==1)
                result+=currentLetter
            else
                result+="$currentLetter$count"

            count=1
            currentLetter=letter
        }
    }
        //последние буквы в строке
    if (count==1)
        result+=currentLetter
    else
        result+="$currentLetter$count"

    return result
}