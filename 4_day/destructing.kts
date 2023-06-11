data class Reponse(val code: Int, val body: String)

fun mockFetch(url: String): Reponse {
    println("Fetch data from $url")
    return Reponse(200, "{data: \"okey\"}")
}

fun main() {
    // My destruction
    val (status, body) = mockFetch("https://some_mocks.com")
    println(if (status == 200) body else "Bad request.")
    // Other destruction
    val exampleMap = mapOf(1 to "green", 2 to "yellow", 255 to "white")
    for ((_, value) in exampleMap) {
        println(value)
    }
}

main()