fun main() {
    val myFirstDice = LuckyDice(6)
    val diceRoll = myFirstDice.roll()
    val luckyNumber = (1..6).random()

    when (diceRoll) {
        luckyNumber -> print("You Win! you rolled ${diceRoll} and your lucky number is ${luckyNumber}")
        1 -> print("So sorry! You rolled a 1. Try again!")
        2 -> print("So sorry! You rolled a 1. Try again!")
        3 -> print("So sorry! You rolled a 1. Try again!")
        4 -> print("So sorry! You rolled a 1. Try again!")
        5 -> print("So sorry! You rolled a 1. Try again!")
        6 -> print("So sorry! You rolled a 1. Try again!")
    }
}

class LuckyDice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }

}