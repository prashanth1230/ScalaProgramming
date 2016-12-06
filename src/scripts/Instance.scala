/**
  * Created by a487037 on 12/06/2016.
  */

//AnyRef and Any are super types of String, so the assignment is allowed
val x: AnyRef = "My String"
val y: Any = x

println(x.isInstanceOf[String])
println(x.isInstanceOf[Int])

//Casting from Any to String
val z: String = y.asInstanceOf[String]
println(z)