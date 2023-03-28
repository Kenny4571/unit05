import kotlin.math.sqrt

fun main() {
    //Function to determine if a number is divisible by another
    fun isNumberDivisible(number: Int, divisor: Int): Boolean {
        return number % divisor == 0
    }

    //Function to determine if a number is prime
    fun isPrime(number: Int): Boolean {
        // Numbers less than 0 are not prime
        if (number < 0) {
            return false
        }

        // Check for divisors from 2 to the square root of number
        for (i in 2..sqrt(number.toDouble()).toInt()) {
            if (isNumberDivisible(number, i)) {
                return false
            }
        }

        return true
    }
    // Test cases
    isPrime(6) // false
    isPrime(13) // true
    isPrime(8893) // true
}
