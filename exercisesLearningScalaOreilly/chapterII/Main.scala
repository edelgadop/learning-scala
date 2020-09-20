package exercisesLearningScalaOreilly.chapterII

object Main extends App {
  // Exercise 1
  val ex1 = new Exercise1
  val temperatureC = 21.0f
  val temperatureF: Float = ex1.celsius2Fahrenheit(temperatureC)
  println("***Exercise 2.1***")
  println(s"$temperatureC ºC <-> $temperatureF ºF\n")

  // Exercise 2
  val ex2 = new Exercise2
  val temperatureF2: Int = ex2.celsius2Fahrenheit(temperatureC)
  println("***Exercise 2.2***")
  println(s"$temperatureC ºC <-> $temperatureF2 ºF\n")

  // Exercise 3
  val inputValue = 2.7255
  val str = f"You owe $$$inputValue%.2f "
  println("***Exercise 3***")
  println(str)
}
