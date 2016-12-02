import java.time.LocalDate

//s  interpolator
val name = "Prashanth"
println(s"Hi ${name}!");

println(s"My age is ${LocalDate.now().getYear - 1988}")

//f interpolator
val ticketCost = 50
val bandName = "Some Band"
println(f"$bandName%s is paying for the ticket cost $$$ticketCost%1.2f")