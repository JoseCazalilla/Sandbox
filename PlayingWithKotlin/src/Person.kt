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
