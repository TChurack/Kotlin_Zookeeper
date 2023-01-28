import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var str = "";
    for (n in 1..4) {
        str += (scanner.nextInt().toString() + "\n")
    }
    println(str)
}