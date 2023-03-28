fun main() {
    // Define functions
    fun generateComputerChoice():Int {
        return (1..3).random()
    }

    fun playGame(userChoice: String):String {
        val computerChoice = generateComputerChoice()

       return  if (computerChoice == 1 && userChoice == "rock") {
            "It's a tie!"
        } else if (computerChoice == 2 && userChoice == "paper") {
            return "It's a tie!"
        } else if (computerChoice == 3 && userChoice == "scissors") {
            return "It's a tie!"
        } else if (computerChoice == 1 && userChoice == "paper") {
            return "Paper wins!"
        } else if (computerChoice == 2 && userChoice == "scissors") {
            return "Scissors wins!"
        } else if (computerChoice == 3 && userChoice == "rock") {
            return "Rock wins!"
        } else {
            return "Invalid choice"
        }

    }

    // Main function

        println("Let's play Rock, Paper, Scissors!")
        println("Please enter your choice (rock, paper or scissors):")

        val userChoice: String = readln()

        val result = playGame(userChoice)
        println(result)
    }
