abstract class Animal (val name: String) {
    open fun getInfo() {
        println("Animal's name is $name")
    }
    abstract fun noise()
}

private class Dog(name: String, private val legs: Int) : Animal(name) {
    override fun noise() {
        println("Guau!!")
        }

    fun numberOfLegs() {
        println("I have $legs legs")
    }
}

private class Cat(name: String, private val legs: Int, private val tail: Int) : Animal(name) {
    override fun noise() {
        println("Miaaau!!")
    }

    fun numberOfLegs() {
        println("I have $legs legs and $tail tail")
    }
}

class AnimalFactory {
    fun getAnimal(animalType: String, name: String) : Animal? {
        val ret = when (animalType) {
            "dog" -> Dog(name, 4)
            "cat" -> Cat(name, 4, 1)

            else -> null
        }
        return ret
    }
}