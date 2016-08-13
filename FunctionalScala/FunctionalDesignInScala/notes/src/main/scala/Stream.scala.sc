def streamRange(lo: Int, hi: Int): Stream[Int] = {
  print(lo+"")
  if(lo >= hi) Stream.Empty
  else Stream.cons(lo, streamRange(lo+1, hi))
}

streamRange(1, 10).take(3).toList

def expr = {
  val x = { print("x"); 1}
  lazy val y = { print("y"); 2}
  def z = { print("z"); 3}

  z+y+x+z+y+x
}

expr
