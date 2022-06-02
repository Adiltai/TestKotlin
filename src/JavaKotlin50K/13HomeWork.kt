package JavaKotlin50K

fun main() {

    ////////задание 1
    val numbers: IntArray = intArrayOf(7, 5, 8, 4, 9, 6, 1, 3, 2)
    numbers.sort()

// println(Arrays.toString(numbers)) // старый способ
    println("Sorted array: ${numbers.contentToString()}")

//Сортировать можно не весь массив, а только определённый диапазон. Указываем начало и размер диапазона. Допустим, нам нужно отсортировать только первые три элемента из предыдущего примера.
    numbers.sort(0, 3)

// 5, 7, 8, 4, 9, 6, 1, 3, 2

//    Сортировка в обратном порядке от наибольшего значения к наименьшему.
    numbers.sortDescending()

////////задание 2      Выполнить сортировку массива {10, 2, 10, 3, 1, 2, 5, 2,-1, 3} методом Простейшей сортировки (Bubble Sort)

    val array = intArrayOf(10, 2, 10, 3, 1, 2, 5, 2,-1, 3)
    println("Было: "+array.toList())
    array.bubbleSort()
    println("Стало: "+array.toList())
}

fun IntArray.bubbleSort() {
    var sorted = false
    while (!sorted) {
        // вложенный цикл
        sorted = true
        for (i in 1 until this.size) {
            val previous = this[i - 1]
            val current = this[i]
            if (previous > current) {
                this.swap(i - 1, i)
                sorted = false
            }
        }
    }
}
fun IntArray.swap(index1: Int, index2: Int) {
    val buffer = this[index1]
    this[index1] = this[index2]
    this[index2] = buffer
}



