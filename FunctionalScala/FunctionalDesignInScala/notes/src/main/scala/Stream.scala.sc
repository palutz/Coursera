def streamRange(lo: Int, hi: Int): Stream[Int] = {
  print(lo+"")
  if(lo >= hi) Stream.Empty
  else Stream.cons(lo, streamRange(lo+1, hi))
}

streamRange(1, 10).take(3).toList

// difference between different definition (each one has a print to show when the definition is evaluated)
def expr = {
  val x = { print("x"); 1}
  lazy val y = { print("y"); 2}
  def z = { print("z"); 3}

  z+y+x+z+y+x
}

expr  // xzyz res1: Int = 12

// sqrt with streams

def sqrtStream(x: Double): Stream[Double] = {
  def improve(guess: Double) = (guess + x / guess) / 2
  lazy val guesses: Stream[Double] = 1 #:: (guesses map improve)
  guesses
}

sqrtStream(160).take(20).toList