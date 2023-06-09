typealias Printer = (String) -> Unit

enum class StatusCode {
    ENABLED,
    DISABLED,
    BROKEN;

    override fun toString(): String {
        return super.toString().lowercase()
    }
}

open class Device(name: String, status: Int) {
    var name = name.uppercase()
    var status = when (status) {
        0 -> StatusCode.DISABLED
        1 -> StatusCode.ENABLED
        else -> StatusCode.BROKEN
    }

    fun print(func: Printer) {
        if (status == StatusCode.BROKEN) {
            func("Lol. How???")
        } else {
            func("Do some work...")
        }
    }
}

fun main() {
    var device = Device("tv", 1)
    println(device.name)
    println(device.status)
    device.print { x -> println(x) }
}

main()