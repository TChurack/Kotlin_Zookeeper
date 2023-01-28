fun main() {
    // put your code here
    val numStudents = readln().toInt()
    var numA = 0
    var numB = 0
    var numC = 0
    var numD = 0

    repeat(numStudents) {

        when (readln().toInt()) {
            2 -> {
                numD++;
            }
            3 -> {
                numC++;
            }
            4 -> {
                numB++;
            }
            5 -> {
                numA++;
            }
            else -> {
                println("Error!")
            }
        }
    }

    println("$numD $numC $numB $numA")
}