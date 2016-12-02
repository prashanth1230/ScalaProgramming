/**
  * Created by a487037 on 12/02/2016.
  */

//All the methods start with def
def add(x:Int, y:Int):Int = {
  return (x + y)
}

println(add(6, 5))

def simplerAdd(x:Int, y:Int) = x + y

println(simplerAdd(2, 3))

def numberStatus(n:Int) =
    if (n < 10) "The number is less than 10"
    else if (n > 10) "The number is greater than 10"
    else "The number is 10!"

println(numberStatus(22))