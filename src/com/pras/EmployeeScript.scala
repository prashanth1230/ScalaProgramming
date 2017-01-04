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
  case e:IllegalArgumentException => println(e.getMessage)
} finally {
  println("Continuing with the program")
}

val manager = new Manager("Alan", "Turing", new Department("Mathematics"), List(prashanth, newPrashanth))
println(manager.fullName)
manager.reportees.foreach(e => println(e.fullName))