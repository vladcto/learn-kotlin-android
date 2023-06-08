fun main() {
    // Functions
    println(product(2, 4))
    printInfo(name = "Amogus", surname = "Sus")
    printInfo(name = "Who")

    // Lambda
    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // Trailing lambda
    println(nums.filter { x -> x % 2 == 0 })
    println(nums.map { x -> x * x })

    // Function declaration
    println(doAction(2)(3))
    println(doMagic(4) { x -> x + 4 + x * 6 })
}

fun product(x: Int, y: Int) = x * y

fun printInfo(name: String, surname: String = "Anonim") {
    println("$name $surname")
}

fun doAction(action: Int): (Int) -> Int = when (action) {
    1 -> { num: Int -> num * num }
    2 -> { num: Int -> num * num * num }
    else -> { num: Int -> num + 15 }
}

fun doMagic(some: Int, magicFun: (Int) -> (Int)): Int {
    return magicFun(2) + magicFun(4) + some
}

main()