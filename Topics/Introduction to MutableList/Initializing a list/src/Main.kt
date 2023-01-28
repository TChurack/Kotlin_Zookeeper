fun main() {
    val numbers =  MutableList(100 ){ i -> if ((i == 0 || i == 9 || i == 99)) i + 1 else 0 }

    // do not touch the lines below 
    println(numbers.joinToString())
}