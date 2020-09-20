package projects.introduction

class SimpleClass2 (x: Int, y: Int) {
  def sum: Int = x + y
  def difference: Int = x - y
  def product: Int = x * y
  override def toString: String = "x = " + x + "\n" + "y = " + y + "\n" + "x + y = " + sum + "\n" + "x - y = " +
    difference + "\n" + "x * y = " + product
}




