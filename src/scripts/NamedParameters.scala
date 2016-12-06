/**
  * Created by a487037 on 12/06/2016.
  */

def processNumbers(x: Int, y: Int, a: Boolean) = if (a) x else y

//We can pass parameters in any order if they are named
println(processNumbers(a = true, x = 10, y = 20))

//Creating a default argument value of y as 10
def add(x: Int, y: Int = 10) = x + y

println(add(10, 20))
println(add(20))