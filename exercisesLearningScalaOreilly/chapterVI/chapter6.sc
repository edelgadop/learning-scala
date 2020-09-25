import scala.annotation.tailrec

// Exercise 1
//  for loop
var t0 = System.nanoTime()
val a = for (i <- 0 to 20 if i%2!=0)  yield i
a.toList
var t1 = System.nanoTime()
print("Elapsed time: " + {(t1-t0)/1e6} + " ms")


// filter
t0 = System.nanoTime()
val b = List.range(0,21).filter(_%2 != 0)
t1 = System.nanoTime()
print("Elapsed time: " + {(t1-t0)/1e6} + " ms")

// map
// Not possible with a single map?
// group-map -> select:
t0 = System.nanoTime()
val c = List.range(0,20).groupMap((k: Int) => k%2 != 0)((v:Int) => v)(true)
t1 = System.nanoTime()
print("Elapsed time: " + {(t1-t0)/1e6} + " ms")

// Fold operations practice
val list = List(0,1,2,3,4,5)
list.foldLeft(0)(_ * _) // Product of all elements
val mean = list.map(_.toFloat).sum/list.length // E[x]
val op = list
  .map(_.toFloat)
  .foldLeft(0f)((x: Float, y: Float) => (x-mean)*(x-mean) + (y-mean)*(y-mean)) // some op

// Exercise 3

def first[A](items: List[A], count: Int): List[A] =
  for (i <- items if items.indexOf(i) < count) yield i
t0 = System.nanoTime()
first(List("a", "b", "c"), 2)
t1 = System.nanoTime()
println(f"Elapsed time ${(t1-t0)/1e6}%.2f ns")

// fold?

// Recursive iteration
@tailrec
def first2[A](items: List[A], count: Int): List[A] = {
  if (items.length == count) return items
  first2(items.dropRight(1), count)
}
t0 = System.nanoTime()
first2(List("a", "b", "c"), 2)
t1 = System.nanoTime()
println(f"Elapsed time ${(t1-t0)/1e6}%.2f ns")


// Exercise 6
def reverse[A](l: List[A]): List[A] =
  for (i<-l) yield l(l.length-l.indexOf(i)-1)
reverse(List(1,2,3,4,5))

