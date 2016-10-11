val longString =
  """ @my long string
  @with some line breaks
@and more
@and more as well""".stripMargin('@')

println(longString)

val regex = """\\w""".r