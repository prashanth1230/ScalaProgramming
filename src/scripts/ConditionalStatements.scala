val a = 10
var result = ""
if (a < 10) {
  result = "a is less than 10"
} else if (a > 10) {
  result = "a is greater than 10"
} else {
  result = "a is 10"
}

println(result)

val result2 = if (a<10) "a is less than 10"
              else if (a>10) "a is greater than 10"
              else "a is 10"
println(result2)