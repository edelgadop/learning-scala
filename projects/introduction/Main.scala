package projects.introduction

object Main extends App {
  var simpClass = new SimpleClass
  simpClass.x = 10
  simpClass.y = 5

  val simpClass2 = new SimpleClass2(3, -2)

  println("Simple Class 1: ")
  print(simpClass)
  println("")
  println("SimpleClass 2: ")
  println(simpClass2)
}

