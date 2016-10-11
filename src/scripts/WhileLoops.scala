var count = 100
var result = ""
while (count > 0) {
  if (count == 100) {
    result = count + ""
  } else {
    result = result + ", " + count
  }
  count = count -1
}
println(result)

//Functional way
println((100 to 1 by -1).mkString(", "))