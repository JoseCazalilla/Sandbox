abstract class Animal (val name: String) {
    open var counter = 0
    open var color: String = ""

    open fun getInfo() {
        println("Animal's name is $name and color: $color")
        println("Animal's color changed $counter times")
    }
    abstract fun noise()

}

private class Dog(name: String, private val legs: Int) : Animal(name) {
    override var counter = 0
    override var color = "NoColor"
    set(color) {
        counter++
    }
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
        return when (animalType) {
            "dog" -> Dog(name, 4)
            "cat" -> Cat(name, 4, 1)

            else -> null
        }
    }
}