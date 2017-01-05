package com.pras

/**
  * Created by Prashanth.Manjunath on 04-01-2017.
  */
class Manager(firstName: String, lastName: String, department: Department, val reportees: List[Employee]) extends Employee(firstName: String, lastName: String, department: Department) {
  //Overriding methods
  override def fullName: String = s"$firstName $lastName in the department ${department.name}"
}
