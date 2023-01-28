fun main() {
    // put your code here
    var value = readln().toInt()

    if (++value % 2 == 1) {
        value++
    }

    println(value)
}