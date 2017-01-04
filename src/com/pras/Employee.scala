package com.pras

/**
  * Created by Prashanth on 11-10-2016.
  */
//Added a default value to the constructor
class Employee(val firstName: String, val lastName: String, val department: Department = new Department("Imaging")) {
  //Creating another ancillary constructor
  def this(firstName: String, lastName: String) = this(firstName, lastName, new Department("Imaging"))

  //Methods inside a class
  def fullName = s"$firstName $lastName"

  //Create a mutator method to change the last name. Note that it does not change the value, but creates a copy
  //The class is still immutable
  def changeLastName(argLastName: String) = new Employee(firstName, argLastName, department)
}

class Department(val name: String)
