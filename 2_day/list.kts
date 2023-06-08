fun main() {
    // Readonly list
    var simple = listOf(1, 2, 3)
    println(simple)
    // Mutable list
    simple = mutableListOf(3, 2, 1)
    println(simple)
    val implictList: MutableList<String> = mutableListOf("1", "2", "3")
    println(implictList)
    println("Last im mutable ${implictList.last()}")
    println("2 in mutable = ${"2" in implictList}")
    implictList.remove("2")
    println("After remove: ${implictList}")
}

main()