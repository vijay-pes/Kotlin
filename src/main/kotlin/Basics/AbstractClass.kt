import kotlin.math.PI

fun main() {
//    val shape = Shape2()      -->cannot create instance of an abstract class
}

// if we want to always be a BASE -->make it abstract -- only childs can implement and use
abstract class Non_abstract{
    fun Ntg(): Unit {
        }
}



//abstarct funtions are always present in abstract class only
abstract class Shape2(){    //by default abstract makes it open
    var name = "Name"
    abstract fun area()
    abstract fun display()
}

// child class must give impl of all parent methods and properties
class Circle2(val radius:Double) : Shape(){
    override fun area(): Double{
        return PI*2*radius
    }
}