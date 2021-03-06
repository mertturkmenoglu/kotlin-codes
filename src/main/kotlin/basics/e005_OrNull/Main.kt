package basics.e005_OrNull

fun main() {
    val validString = "1234"
    println(validString.toInt())
    println(validString.toIntOrNull())

    val invalidString = "Emily"
    println(invalidString.toIntOrNull()) // Will return null

    try {
        println(invalidString.toInt()) // Will throw NumberFormatException
    } catch (e: NumberFormatException) {
        e.printStackTrace()
    }
}