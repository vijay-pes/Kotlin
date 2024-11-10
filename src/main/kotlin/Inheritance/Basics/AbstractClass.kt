import kotlin.math.PI

fun main() {
    val shape = Shape2()
}






abstract class Shape2(){
    var name = "Name"
    abstract fun area()
    abstract fun display()
}

class Circle(val radius:Double) : Shape(){
    override fun area(): Double{
        return PI*2*radius
    }
}