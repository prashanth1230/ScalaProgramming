package com.pras

/**
  * Created by a487037 on 10/12/2016.
  */
class CompareTriplets {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val a0 = sc.nextInt()
    val a1 = sc.nextInt()
    val a2 = sc.nextInt()
    val b0 = sc.nextInt()
    val b1 = sc.nextInt()
    val b2 = sc.nextInt()
    val pointsA = (if (a0 > b0) 1 else 0) + (if (a1 > b1) 1 else 0) + (if (a2 > b2) 1 else 0)
    val pointsB = (if (b0 > a0) 1 else 0) + (if (b1 > a1) 1 else 0) + (if (b2 > a2) 1 else 0)
    println(s"$pointsA $pointsB")
  }
}
