var result = ""
for (a <- 1 to 100) {
  result = result + a
  if (a < 100) result = result + ","
}
println(result)

val xs = List(1, 2, 3, 4)
var result2 = List[Int]()
//Adding 1 to all the elements in the list
for (a <- xs) {
  result2 = result2 :+(a + 1)
}
println(result2)

val xs2 = List(1, 2, 3, 4)
//Yield method creates a copy List
val result3 = for (a <- xs2) yield (a + 1)
println(result3)
