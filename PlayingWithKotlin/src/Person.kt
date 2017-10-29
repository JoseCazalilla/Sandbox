// If you make it var -> mutable
open class Person (val name: String, var age: Int) {
    open fun makeOlder(){
        age++
        useless()
    }

    private fun useless() {
        //Cannot be called from outside
    }
}

class child(name: String): Person(name, 12) {
    init {
        println("This is the constructor of child!")
    }

    override fun makeOlder(){
        println("Nevermind!")
    }
}

open class A {
    open fun f() { print("A") }
    fun a() { print("a") }
}

interface B {
    fun f() { print("B") } // interface members are 'open' by default
    fun b() { print("b") }
}

class C() : A(), B {
    // The compiler requires f() to be overridden:
    override fun f() {
        super<A>.f() // call to A.f()
        super<B>.f() // call to B.f()
    }
}

class MyClass private constructor(val name: String) {

    companion object Factory {
        fun create(name: String): MyClass = MyClass(name)
    }
    fun tellMeMyName() {
        println(this.name)
    }
}

fun Int.r(): RationalNumber = RationalNumber(this, 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first, this.second)

data class RationalNumber(val numerator: Int, val denominator: Int)

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) = when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2


class DateRange(val start: MyDate, val endInclusive: MyDate) {

    // The solution proposed was with a "return start < d && d <= endInclusive", but this one is good as well
    operator fun contains (d: MyDate) = when {
        start < d && d <= endInclusive  -> true
        else -> false
    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}