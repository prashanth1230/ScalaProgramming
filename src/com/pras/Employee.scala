package com.pras

/**
  * Created by Prashanth on 11-10-2016.
  */
class Employee(val firstName: String, val lastName: String, val department: String) {
  //Creating another ancillary constructor
  def this(firstName: String, lastName: String) = this(firstName, lastName, "Imaging")
}

class Department(val name: String)
