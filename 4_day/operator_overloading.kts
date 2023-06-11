fun interface SomeMagic {
    operator fun inc(): SomeMagic
}

class MyMagic(var num: Int) : SomeMagic {
    override fun inc(): MyMagic = MyMagic(num * num)
}

class StandartMagic(var num: Int) : SomeMagic {
    override fun inc(): StandartMagic = StandartMagic(num + 1)
}

fun MyMagic.doSomeWork() {
    println("I`m here!")
}

fun main() {
    var myMagic = MyMagic(2)
    var stdMagic = StandartMagic(2)
    println("My magic ${(++myMagic).num}")
    println("Std magic ${(++stdMagic).num}")
    myMagic.doSomeWork()
}

main()