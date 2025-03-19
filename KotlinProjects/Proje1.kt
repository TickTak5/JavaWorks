package ProjectsOOP

import kotlin.math.roundToInt

fun main() {
    var circle: Circle = Circle(5)
    var rectangle: Rectangle = Rectangle(5,7)
    var triangle: Triangle = Triangle(8,7,9)

    val shapes = listOf(circle,rectangle,triangle)

    for (shape in shapes){
        println("area: ${shape.area()}")
        println("perimeter: ${shape.perimeter()}")
    }

}

abstract class Shape {
    abstract fun area():Int
    abstract fun perimeter(): Int
}

class Circle(var r: Int) : Shape() {
    override fun area(): Int {
        return (Math.PI * r * r).roundToInt()
    }

    override fun perimeter(): Int {
        return (2 * Math.PI * r).roundToInt()
    }
}

class Rectangle(var a: Int, var b: Int) : Shape() {
    override fun area(): Int {
        return a * b
    }

    override fun perimeter(): Int {
        return (a + b) * 2
    }

}

class Triangle(var base:Int,var height:Int , var third: Int) : Shape(){
    override fun area(): Int {
        return (base * height) / 2
    }
    override fun perimeter(): Int {
        return base + height + third
    }
}