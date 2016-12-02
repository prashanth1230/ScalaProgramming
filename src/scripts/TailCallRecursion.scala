/**
  * Created by a487037 on 12/02/2016.
  */

import scala.annotation.tailrec

@tailrec
def factorial(n: BigInt, acc: BigInt): BigInt = {
  if (n == 0 || n == 1) acc
  else factorial(n - 1, acc * n)
}

//Using a tailrec factorial to calculate the factorial of a very large number
println(factorial(10000, 1))