fun main() {
    fun celsius(fTemp: Float): Float {
        return 5/9f * (fTemp - 32)
    }

// Call the function in a loop that displays a table of the Fahrenheit temperatures 0 through 20 and their Celsius equivalents
    for (fTemp in 0..20) {
        val cTemp = celsius(fTemp.toFloat())
        println("Fahrenheit: $fTemp | Celsius: $cTemp")
    }
}
