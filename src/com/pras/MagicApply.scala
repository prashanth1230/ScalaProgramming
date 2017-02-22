package com.pras

/**
  * Created by Prashanth.Manjunath on 22-02-2017.
  * Run as scala -nc com.pras.MagicApply
  */

class Foo(x: Int) {
  def apply(y: Int) = x + y
}

object MagicApply extends App {
  val foo = new Foo(10)
  println(foo.apply(20))
  //If the method is called apply, there is no need to specify the method name.
  println(foo(20))
}
