fun main() {
    // write your code here
    var toPrint = ""
    for (i in 1..4) {
        var c: Char = readln().first()

        toPrint += (--c).toString() + '\n'
    }
    println(toPrint)
}