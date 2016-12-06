/**
  * Created by a487037 on 12/06/2016.
  */

import scala.annotation.tailrec

def factorial(n: BigInt): BigInt = {
  @tailrec
  def fact(n: BigInt, acc: BigInt): BigInt = {
    if (n == 0 || n == 1) acc
    else fact(n - 1, acc * n)
  }
  fact(n, 1)
}

//Using a tailrec factorial to calculate the factorial of a very large number
println(factorial(10000))