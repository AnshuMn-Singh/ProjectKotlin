package OOPS

open class Father {
    var x = 40
    fun displayX() {
        println("X = $x")
    }
}

open class Son : Father() {
    var y = 50
    fun displayY() {
        println("Y = $y")
    }
}

class GrandSon : Son() {
    var prop = "main to child of Son"
}

fun main() {
    val son = Son()
    son.displayX()
    son.displayY()

    val grandSon = GrandSon()
    println(grandSon.prop)
    grandSon.displayX()
    grandSon.displayY()
}
