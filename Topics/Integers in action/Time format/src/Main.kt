fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    val modSeconds = totalSeconds % 60;
    val modMinutes = (totalSeconds % (60 * 60)) / 60;
    val modHours = (totalSeconds % (60 * 60 * 24)) / (60 * 60)

    print("$modHours:$modMinutes:$modSeconds")
}