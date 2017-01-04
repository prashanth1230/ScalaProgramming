import com.pras.Employee

/**
  * Created by Prashanth Udupa on 04-01-2017.
  */

val prashanth = new Employee("Prashanth", "Udupa")
println(prashanth.firstName)

val newPrashanth = prashanth.changeLastName("Manjunath")
println(newPrashanth.lastName)

//If the compiled classes are cached, run the command with -nc switch
//scala -nc com\pras\EmployeeScript.scala