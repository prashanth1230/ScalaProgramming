//Java Style
val str = String.format("This is a %s", "Test")
println(str)

//Scala Style
val str2 = "This is a %s".format("Test")
println(str2)

println("Because you are a %3$s, %3$s and %1$s times a lady".format("Thrice", "Twice", "Once"))

import java.time._
println("We will be eating lunch %1$tB the %1$te in the year %1$tY.".format(LocalDate.now))
printf("We will be eating lunch %1$tB the %1$te in the year %1$tY.", LocalDate.now)