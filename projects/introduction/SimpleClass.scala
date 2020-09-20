package projects.introduction

class SimpleClass {
  private var _x: Int = 0
  private var _y: Int = 0

  def x = _x
  def x_= (newValue: Int) = {
    _x = newValue
  }

  def y = _y
  def y_= (newValue: Int): Unit = {
    _y = newValue
  }

  def sum: Int = _x + _y
  def difference: Int = _x - _y
  def product: Int = _x * _y

  override def toString: String = "x = " + _x + "\n" + "y = " + _y + "\n" + "x + y = " + sum + "\n" + "x - y = " +
    difference + "\n" + "x * y = " + product
}

