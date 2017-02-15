import com.pras.{Department, Employee, Manager}

/**
  * Created by Prashanth Udupa on 04-01-2017.
  */

val prashanth = new Employee("Prashanth", "Udupa")
println(prashanth.firstName)

val newPrashanth = prashanth.changeLastName("Manjunath")
println(newPrashanth.lastName)

val anotherPrashanth = newPrashanth.copy(argLastName = "Udupa")
println(anotherPrashanth.lastName)

//If the compiled classes are cached, run the command with -nc switch
//scala -nc com\pras\EmployeeScript.scala

//Demostration of try/catch block
try {
  val nik = new Employee("", "D.R")
} catch {
  case e: IllegalArgumentException => println(e.getMessage)
} finally {
  println("Continuing with the program")
}

val manager = new Manager("Alan", "Turing", new Department("Mathematics"), List(prashanth, newPrashanth))
println(manager.fullName)
manager.reportees.foreach(e => println(e.fullName))

val prashanth2 = new Employee("Prashanth", "Udupa")
println(prashanth.equals(prashanth2))
//We have overridden the == method too just be overriding the equals method
println(prashanth == prashanth2)
//The reference equality is checked below
println(prashanth eq prashanth2)

//Checking the case classes
val toys = new Department("Toys")
println(toys)
//Case classes create a toString, equals and hashCode methods automatically
val toys2 = new Department("Toys")
println(toys == toys2)
println(toys eq toys2)

//Case classess also create a copy method automatically
val toys3 = toys.copy()
println(toys3)

val hardware = toys.copy(name = "Hardware")
println(hardware)

//Case classes make "new" keyword optional
val hardware2 = Department("Hardware")
println(hardware2)