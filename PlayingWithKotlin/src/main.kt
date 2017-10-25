fun getStringLength(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` is automatically cast to `String` in this branch
    return obj.length
}

fun describe(obj: Any): String =
        when (obj) {
            1          -> "One"
            "Hello"    -> "Greeting"
            is Long    -> "Long"
            !is String -> "Not a string"
            else       -> "Unknown"
        }

fun main(args: Array<String>) {
    // Immutable
    val name = "Jose"

    // Mutable
    var myAge = 29

    // You can specify the type
    var bigInt: Int = Int.MAX_VALUE

    // Between brackets if it is a function
    println("Biggest In is $bigInt")

    //Casting example
    println("3.12 to Int: ${3.12.toInt()}")
    println("A to Int: ${'A'.toInt()}")

    // Playing with arrays
    var myArray = arrayOf(1, 1.23, "Foo")
    myArray[2] = "Bar"

    var sqArray = Array(5, {x -> x*x})
    println(sqArray[2])

    //Ranges (reversed as well)
    val oneTo20 = 1..20
    for (x in oneTo20) println(x)

    val l = getStringLength("Hello")
    println(l)

    println("${describe("Bruuu")}")



}