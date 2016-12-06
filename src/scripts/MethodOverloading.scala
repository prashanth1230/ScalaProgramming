/**
  * Created by a487037 on 12/06/2016.
  */

def add(a: Int, b: Int): Int = {
  println("Using int version")
  a + b
}
def add(a: Double, b: Double): Double = {
  println("Using double version")
  a + b
}

println(add(1, 2))
println(add(1.3, 2.5))