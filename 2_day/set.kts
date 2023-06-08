fun main() {
    // Immutable set
    val readSet = setOf("1", "1", "2", "3")
    println(readSet)
    val writeSet = mutableSetOf("1", "1", "2", "3")
    println(writeSet)
    writeSet.add("4")
    println(writeSet)
}

main()