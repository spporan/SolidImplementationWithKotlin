/**
*  We should be able to use subclasses instead of the parent classes which class they have extended,
*  without the need to make any changes in our code. In simple words,
*  the child class must be substitutable for the parent class.
*  Since child classes extended from the parent classes, they inherit their behavior.
*
* Implement  without following Liskob substitute
 */

interface Vehicle {
    var isEngineWorking = false
    fun startEngine()
    fun stopEngine()
    fun moveForward()
    fun moveBack()
}

class Car: Vehicle() {
    override fun startEngine() {
        println("Engine started")
        isEngineWorking = true
    }

    override fun stopEngine() {
        println("Engine stopped")
        isEngineWorking = false
    }

    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}


class Bicycle: Vehicle(){
    override fun startEngine() {
    // TODO("Not yet implemented")
    }

    override fun stopEngine() {
    // TODO("Not yet implemented")
    }

    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}



/**
*  We should be able to use subclasses instead of the parent classes which class they have extended,
*  without the need to make any changes in our code. In simple words,
*  the child class must be substitutable for the parent class.
*  Since child classes extended from the parent classes, they inherit their behavior.
*
* Let's solve the problem  following Liskob substitute
*/

interface Vehicle {
    fun moveForward()
    fun moveBack()
}

abstract class VehicleWithEngine: Vehicle{
    private var isEngineWorking = false
    open fun startEngine(){ isEngineWorking = true }
    open fun stopEngine(){ isEngineWorking = false }
}

class MarcedeezCar:  VehicleWithEngine {
    override fun startEngine() {
        super.startEngine()
        println("Engine started")
    }

    override fun stopEngine() {
        super.stopEngine()
        println("Engine stopped")
    }

    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}

class Bicycle: Vehicle {
    override fun moveForward() {
        println("Moving forward")
    }

    override fun moveBack() {
        println("Moving back")
    }
}

