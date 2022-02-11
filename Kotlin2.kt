// 2. Написать функцию, которая проверяет меньше ли первое число второго и возвращает Boolean
fun main() {
    val number1 = 5
    val number2 = 6
    println(check(number1, number2))
}

fun check(number1: Int, number2: Int): Boolean {
    return number1 > number2
}