// Exercise 1
val funcLiteral = (x: Int, y: Int) => if (x > y) x else y
def funcHighOrder (x: Int, y: Int, z: Int, f: (Int, Int) => Int) =
  f(f(x,y),z)

funcHighOrder(2,3,-1, funcLiteral)

// Exercise 3
def fu(y: Int): Int => Int = { x: Int => y * x }
fu(10)(1)

