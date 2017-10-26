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
