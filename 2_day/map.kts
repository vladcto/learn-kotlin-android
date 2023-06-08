fun main() {
    val readMap = mapOf(1 to "1", 2 to "2", 3 to "3")
    println(readMap)
    val writeMap = mutableMapOf(1 to "1", 2 to "2", 3 to "3", 1 to "one")
    println(writeMap)
    writeMap.put(4, "4")
    println(writeMap[4])
}

main()