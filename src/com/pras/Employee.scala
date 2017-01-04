package com.pras

/**
  * Created by Prashanth on 11-10-2016.
  */
//Added a default value to the constructor
class Employee(val firstName: String, val lastName: String, val department: Department = new Department("Imaging")) {
  //Creating another ancillary constructor
  def this(firstName: String, lastName: String) = this(firstName, lastName, new Department("Imaging"))
}

class Department(val name: String)
