// Exercise 1
val funcLiteral = (x: Int, y: Int) => if (x > y) x else y
def funcHighOrder (x: Int, y: Int, z: Int, f: (Int, Int) => Int) =
  f(f(x,y),z)

funcHighOrder(2,3,-1, funcLiteral)

// Exercise 3
def fu(y: Int): Int => Int = { x: Int => y * x }
fu(10)(1)

// Exercise 4
def fzero[A](x: A)(f: A => Unit): A = { f(x); x }
fzero("x")(println(_))

// Exercise 5
val sq = (m: Int) => m * m
sq(5)

// Exercise 6
def conditional[A](x: A, p: A => Boolean, f: A => A): A =
  if (p(x)) f(x) else x
conditional(9, (x: Int) => x%2 == 0, (x: Int) => x * x)
conditional(10, (x: Int) => x%2 == 0, (x: Int) => x * x)
