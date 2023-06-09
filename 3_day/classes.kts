class Gamburger(val comboName: String) {
    var owner = "UNKNOWN"
        get() = field
        set(value) {
            field = value.uppercase()
        }

    fun eat() {
        println("[$owner] Mmmooaoaoamm, $comboName is tasty.")
    }
}

fun main() {
    val myGamburger = Gamburger("Very expensive COMBO")
    myGamburger.eat()
    myGamburger.owner = "Hamburg"
    myGamburger.eat()
}

main()