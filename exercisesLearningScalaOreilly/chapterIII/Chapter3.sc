// Exercise 3.1
val s = "Some string"
val result = s match {
  case x if x.length > 0 => x
  case _ => "n/a"
}
val s2 = ""
val result2 = s2 match {
  case x if x.length > 0 => x
  case _ => "n/a"
}
print("***Exercise 3.1***")
println(s"Non-empty string: $result")
println(s"Empty string: $result2 ")

// Exercise 3.2
val amount = -3.47d
val res = amount match {
  case x if x >0 => "greater"
  case x if x<0 => "less"
  case x if x==0 => "same"
  case other => s"Error. Got $other"
}
println(s"$amount is $res than/as zero")

// Exercise 3.3
//
//

// Exercise 3.4
for (i <- 1 to 100) {
  print(f"$i%d, ")
  if (i%5 == 0) print("\n")
}

// Exercise 3.5
for (i <- 1 to 100) {
  if (i%3 == 0) print("type, ")
  if (i%5 == 0) print("safe, ")
  if (!(i%3 == 0) & !(i%5 == 0)) print(f"$i%d, ")
}

// Exercise 3.6
for (i <- 1 to 100) {if (i%3 == 0) print("type, "); if (i%5 == 0) print("safe, "); if (!(i%3 == 0) & !(i%5 == 0)) print(f"$i%d, ")}