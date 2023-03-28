fun main() {
    fun calculateProfit(nS: Int, pP: Double, pC: Double, sP: Double, sC: Double): Double {
        return ((nS * sP) - sC) - ((nS * pP) + pC)
    }

// Demonstrate the function in a program that asks the user
// to enter the necessary data and displays the amount of the profit or loss.

    println("Enter the number of shares: ")
    val nS = readln().toInt()
    println("Enter the purchase price per share: ")
    val pP = readln().toDouble()
    println("Enter the purchase commission paid: ")
    val pC = readln().toDouble()
    println("Enter the sale price per share: ")
    val sP = readln().toDouble()
    println("Enter the sale commission paid: ")
    val sC = readln().toDouble()

    val profitOrLoss = calculateProfit(nS, pP, pC, sP, sC)

    if (profitOrLoss > 0.0) {
        println("The sale of the stock resulted in a profit of $profitOrLoss")
    } else if (profitOrLoss < 0.0) {
        println("The sale of the stock resulted in a loss of $profitOrLoss")
    } else {
        println("The sale of the stock resulted in neither a profit or a loss.")

    }
}

