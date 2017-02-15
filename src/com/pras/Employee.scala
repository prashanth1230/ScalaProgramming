package com.pras

/**
  * Created by Prashanth on 11-10-2016.
  */
//Added a default value to the constructor
class Employee(val firstName: String, val lastName: String, val department: Department = new Department("Imaging")) {
  //Field validators
  require(firstName.nonEmpty, "First Name should not be empty")
  require(lastName.nonEmpty, "Last Name should not be empty")
  require(department.name.nonEmpty, "Department Name should not be empty")

  //Manual precondition check
  if (firstName.equals("Mr") || firstName.equals("Mrs")) {
    throw new IllegalArgumentException("First name cannot be Mr or Mrs")
  }

  //Creating another ancillary constructor
  def this(firstName: String, lastName: String) = this(firstName, lastName, new Department("Imaging"))

  //Methods inside a class
  def fullName = s"$firstName $lastName"

  //Create a mutator method to change the last name. Note that it does not change the value, but creates a copy
  //The class is still immutable
  def changeLastName(argLastName: String) = new Employee(firstName, argLastName, department)

  //Creating a copy constructor
  def copy(argFirstName: String = firstName, argLastName: String = lastName, argDepartment: Department = department) = new Employee(argFirstName, argLastName, argDepartment)

  override def equals(x: Any): Boolean = {
    if (!x.isInstanceOf[Employee]) false
    val other = x.asInstanceOf[Employee]
    other.firstName.equals(this.firstName) &&
    other.lastName.equals(this.lastName)
  }
}

case class Department(val name: String)
