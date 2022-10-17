/**
* Implement without  open-close principle
*/

class Rectangle {
    private var length
    private var height

}

class Circle {
    private var radius
}

class AreaFactory {
    public fun calculateArea(shapes: ArrayList<Object>): Double {
        var area = 0
        for (shape in shapes) {
            if (shape is Rectangle) {
                var rect = shape as Rectangle;
                area += (rect.getLength() * rect.getHeight());
            } else if (shape is Circle) {
                var circle = shape as Circle;
                area += (circle.getRadius() * cirlce.getRadius() * Math.PI);
            } else {
                throw new RuntimeException("Shape not supported");
            }
        }
        return area;
    }
}

/**
*
*  This principle has two meanings.
*  Open: This means that we can add new features to our classes. When there is a new requirement,
*   we should be able to add new features to our class easily.
*
*  Close: This means that the base features of the class should not be changed.
*
 * Now we are going to solvve this problem  using following the open-close principle
 */


internal interface  Shape {
    fun area(): Double
}

class Rectangle: Shape {
    var height: Double =  0
    var width: Double = 0

    override fun area(): Double =  height * width
}

class Circle: Shape {
    var height: Double =  0

    override fun area(): Double =  height * height
}

class AreaFactory {
    public fun calculateArea(shapes: ArrayList<Shape>): Double {
        var area = 0
        for (shape in shapes) {
           area += shape.area()
        }
        return area;
    }
}


