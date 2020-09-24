import java.text.SimpleDateFormat
import scala.annotation.tailrec

// Exercise 1
def area_circle(radius: Double) = Math.PI * Math.pow(radius, 2)
val area = area_circle(4.0)
println(f"Area = $area%.2f")

//Exercise 2
def area_circle(radius: String) = {
  val radiusNum = radius.toDouble
  Math.PI * Math.pow(radiusNum, 2)
}
val area2 = area_circle("4.0")
println(f"Area = $area2%.2f")

// area_circle("")

// Exercise 3
@tailrec
def recursiveFunc(idx: Integer): Unit = {
  print(idx + " ")
  if (idx==50) return
  recursiveFunc(idx+5)
}
recursiveFunc(5)

// Exercise 4
def toDate(millis: Long): String = {
  val fmt: SimpleDateFormat = new SimpleDateFormat("yyyy-mm-dd")
  fmt.format(millis)
}
toDate(System.currentTimeMillis())

// Exercise 6
def difference(x1: Double, y1: Double)(x2:Double, y2: Double): (Double, Double) = {
  val xd = x1 - x2
  val yd = y1 - y2
  (xd, yd)
}
difference(1,-1)(2,3)
