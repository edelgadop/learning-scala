package projects.strings

object StringInterpolation extends App {
  println("***Example 1: s interpolator ")
  val first = "John"
  val middle = "F."
  val last = "Kennedy"
  println(s"$first $middle $last")

  println("***Example 2: escaping double quotes")
  val json = """{"first":"""" + first + """", "middle": """" + middle + """", "last": """" + last + """"}"""
  println(json)

  println("***Example 3: f formatting")
  val x = 1
  val y = 2.2f
  val z = 9.32e9
  val date = "14/06/1137"
  println(f"Decimal integer: $x%d. Float number: $y%.2f . Scientific notation: $z%.1e")
  println("Formatting numbers: ")
  println(f"$x %n $x%2d %n $x%04d %n $x%+d")


}
