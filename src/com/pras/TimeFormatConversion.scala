package com.pras

/**
  * Created by a487037 on 10/12/2016.
  */
class TimeFormatConversion {
  def main(args: Array[String]): Unit = {
    val currentTime: java.time.LocalTime = java.time.LocalTime.parse("07:05:45PM", new java.time.format.DateTimeFormatter("hh:mm:ssa"))
    println(currentTime)
  }
}
