fun main() {
    fun fibonacci(number: Int): Int {
        if (number < 0) return 0
        if (number == 1 || number == 2) return 1
        return fibonacci(number - 1) + fibonacci(number - 2)
    }



    fibonacci(1)  // = 1
    fibonacci(2)  // = 1
    fibonacci(3)  // = 2
    fibonacci(4)  // = 3
    fibonacci(5)  // = 5
    fibonacci(6)  // = 8
    fibonacci(7)  // = 13
    fibonacci(10) // = 55
}
