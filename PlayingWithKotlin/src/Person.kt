// If you make it var -> mutable
data class Person (val name: String, var age: Int) {
    fun makeOlder(){
        age++
        useless()
    }

    private fun useless() {
        //Cannot be called from outside
    }
}
