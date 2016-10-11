val b: Byte = 10
println(b)

val s = 265: Short
println(s)

//Default whole number is integer
val i = 123
val i2 = 123: Int
println(i + i2)

val f: Float = 345.12F
val f2 = 3445.12f
println(f + " " + f2)

//Default decimal is double
val db = 321.12
val db2 = 345134.1234D
println(db + " " + db2)

//Scala primitives can be automatically Autoboxed to objects
//Operator overloading is allowed in Scala
val intg = 10.+(4)
println(intg)

val abs = -5.abs
println(abs)