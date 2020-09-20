package exercisesLearningScalaOreilly.chapterII

class Exercise2 {
  def celsius2Fahrenheit(x: Float): Int = {
    val value1 = x * (9/5)
    val value2 = value1 + 32
    value2.toInt
  }
}
