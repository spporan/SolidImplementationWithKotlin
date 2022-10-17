/**
 * This principle states that once an interface becomes too fat,
 *  it needs to be split into smaller interfaces so that
 * client of the interface will only know about the methods that pertain to them.
 *
 * Implement without interface segregation
 */


interface Animal {
    fun eat()
    fun sleep()
    fun fly()
    fun  drive()
}

class Cat: Animal {
    override fun eat() {
        println("Cat is eating fish")
    }

    override fun sleep() {
        println("Cat is sleeping on its owner's bed")
    }

    override fun fly() {
        TODO("Not yet implemented") // Cats can't fly
    }

    override fun drive() {
        TODO("Not yet implemented") // Cats can't drive
    }
}

class Bird: Animal {

    override fun eat() {
        println("Bird is eating forage")
    }

    override fun sleep() {
        println("Bird is sleeping in the nest")
    }

    override fun fly() {
        println("Bird is flying so high")
    }

    override fun drive() {
        TODO("Not yet implemented") // Birds can't drive
    }
}

class Fish: Animal {

    override fun eat() {
        println("Fish is eating forage")
    }

    override fun sleep() {
        println("Fish is sleeping in the nest")
    }

    override fun fly() {
        TODO("Not yet implemented") // Fish can't fly
    }

    override fun drive() {
        println("Fish is driving in river")
    }
}



/**
* This principle states that once an interface becomes too fat,
*  it needs to be split into smaller interfaces so that
* client of the interface will only know about the methods that pertain to them.
*
* Solve above problem using interface segregation principle
*/

interface Animal {
    fun eat()
    fun sleep()
}

interface FlyingAnimal {
    fun fly()
}

interface DrivingAnimal {
    fun drive()
}

class Cat: Animal {

    override fun eat() {
        println("Cat is eating fish")
    }

    override fun sleep() {
        println("Cat is sleeping on its owner's bed")
    }
}

class Bird: Animal, FlyingAnimal {

    override fun eat() {
    println("Bird is eating forage")
    }

    override fun sleep() {
        println("Bird is sleeping in the nest")
    }

    override fun fly() {
        println("Bird is flying so high")
    }

}

class Fish: Animal, DrivingAnimal {

    override fun eat() {
        println("Fish is eating forage")
    }

    override fun sleep() {
        println("Fish is sleeping in the nest")
    }

    override fun drive() {
        println("Fish is driving in river")
    }
}
