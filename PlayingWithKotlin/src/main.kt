import java.math.BigDecimal

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

    // Lambdas example. That's the same
    val example = listOf(1,2,3,4).map { value -> value * 2}
    val example2 = listOf(1,2,3,4).map {it * 2}

    // Filter, sorted by, map, etc. Super-powerful
    val str = listOf("a", "ab", "abc", "abcd", "abcde").filter { it.contains("c") }
            .sortedDescending()
            .count()

    val example3 = listOf(1,2,3,4).forEach{value -> println("$value")}
    val example4 = listOf(1,2,3,4).forEach{println("$it")}
    println(str)

    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(5, { it.times(it).toString() })
    asc.forEach { println(it) }

    // Lambdas are nice
    val myPerson: Person = Person("Jose", 29)
    val takeUnless = myPerson.takeUnless { it.age == 29 }

    // Getting 5 years younger...
    val myPplList = listOf(Person("Jose", 29), Person("Irene",27)).sortedByDescending { it.age }

    // Now we are 5 years younger!
    // I can change it because the attribute age is mutable
    myPplList.forEach { it.age-=5
        println(it)}

    myPplList.forEach { it.makeOlder()
        println(it)}

    //Null checks

    val b = "Hello"
    val k = b?.length ?: -1

    // Here the compiler doesn't know, as it is mutable
    var b2: String? = "Hello"
    b2 = null
    val k2 = b2?.length ?: -1

    val myChild = child("Noelia")
    myChild.makeOlder()

    println(k2)

    // You cannot do this, as the constructor is private
    // val testMyClass = MyClass("This is my name")

    // You can only do it using a factory-like
    val testMyClass = MyClass.create("Holaaa")
    testMyClass.tellMeMyName()




}