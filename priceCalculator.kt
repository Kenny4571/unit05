fun main() {
    fun calculateRetail(wholesaleCost: Double, markupPercentage: Int): Double {
        return (wholesaleCost * (1.0 + (markupPercentage/100.0)))
    }

        println("Please enter the item's wholesale cost:")
        val cost = readln().toDouble()

        println("Please enter the item's markup percentage:")
        val percentage = readln().toInt()

        val retailPrice = calculateRetail(cost, percentage)

        println("The item's retail price is $retailPrice.")
    }
