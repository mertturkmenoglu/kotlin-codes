package oop.e002_MethodResolution

interface Person {
    fun introduce() {
        print(Person::class.simpleName)
    }
}

interface Player {
    fun introduce() {
        print(Player::class.simpleName)
    }
}

class FootballPlayer : Person, Player {
    override fun introduce() {
        print(FootballPlayer::class.simpleName)
    }
}

fun main() {
    val fp = FootballPlayer()
    fp.introduce()
}