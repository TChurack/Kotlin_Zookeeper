// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
    val mutList = mutableListOf<Char>('!', '@', '#', '$')

    println(mutList[-1])
    println(mutList[mutList.size - 2])
    println(mutList[mutList.lastIndex])
    println(mutList.last())
    println(mutList[mutList.size + 1])
    println(mutList[mutList.size - 1])
    println(mutList[mutList.size])
}
