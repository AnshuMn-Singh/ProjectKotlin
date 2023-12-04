package OOPS

fun calculateArea(shape: Shape) {
    shape.findArea()
}

fun main() {
    val shape: Shape = Rectangle()
    calculateArea(shape)

    val shape1: Shape = Circle()
    calculateArea(shape1)
}

open class Shape {
    open fun findArea() {
        println("finding area of shape")
    }
}

class Circle : Shape() {
    override fun findArea() {
        println("Finding area of circle")
    }
}

class Rectangle : Shape() {
    override fun findArea() {
        println("Finding area of rectangle")
    }
}
