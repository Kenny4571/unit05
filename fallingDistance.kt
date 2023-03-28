fun main() {
    fun fallingDistance(t: Double): Double {
        val g = 9.8
        return 0.5 * g * t * t
    }

            for (i in 1..10) {
            println("The object has fallen ${fallingDistance(i.toDouble())} meters in $i second(s).")
        }
    }
