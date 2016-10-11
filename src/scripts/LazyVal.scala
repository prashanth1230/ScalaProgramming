lazy val a = { println("Value evaluated"); 5 }
//The value is not yet evaluated. It is evaluated only when it is called.
//The first statement is a code block. The print statement just prints and does not return any value.
//5 is returned and is assigned to a
println(a)

//Calling again
println(a)

//b not initialized but still just throws a warning without lazy
//with lazy there are no errors
val x = 10 + b
lazy val b = 13
println(x)