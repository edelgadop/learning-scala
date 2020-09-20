package projects.lists

object BasicListPractice extends App {
  val list1: List[Integer] = List(1, 2, 3, 4, 5)
  val list2 = List("a", "b", "c", "d")
  val list3 = List(6, 7, 8, 9, 10)

  println("list1 = " + list1)
  println("list2 = " + list2)
  println("list3 = " + list3)

  val list4 = list1 ++ list3
  println("List concatenation: list1 ++ list3 =  " + list4)

  val list5 = list1.map(_ * 2)
  println("Using map. Applying square to each element of the previous list. L = " + list5)

}
