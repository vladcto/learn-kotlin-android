fun main() {
    // Condition
    val isTrue = true
    if (isTrue) {
        println("Это правда")
    } else {
        println("Это неправда")
    }
    println("124 Делиться на 4 без остатка = ${if (124 % 4 == 0) "правда" else "ложь"}")

    // When
    val num = 15
    var result = when {
        num % 15 == 0 -> "FizzBuzz"
        num % 3 == 0 -> "Fizz"
        num % 5 == 0 -> "Buzz"
        else -> num.toString()
    }
    println(result)

    // Ranges
    println('a'..'z')

    // Cycles
    for (letter in 'a'..'z' step 2) {
        print(letter)
    }
    println()

    for (number in 1..10) {
        print("$number ")
    }
    println()

    var i = 1
    while (i < 10) {
        print("$i ")
        i += i
    }
}

main()