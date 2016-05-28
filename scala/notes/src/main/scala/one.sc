// define  && and || without using the symbols
def and(x:Boolean, y: =>Boolean) = if(x) y else false
def or(x:Boolean,y: =>Boolean) = if(x) true else y
and(false, true)
// def loop: Boolean = loop
// and(false, loop)
// and(true, loop) ... infinite loop
or(false, false)
or(true, false)
// **********************
// Compute sqrt with Newton method
val estimate = 1
def sqrIter(guess: Double, x: Double): Double =
  if(isGoodEnough(guess, x)) guess
  else sqrIter(improve(guess, x), x)

def isGoodEnough(guess: Double, x: Double): Boolean =
  Math.abs(guess - x) / x < 0.001

def improve(guess: Double, x: Double): Double =
  (guess + x / guess) / 2


def sqrt(x: Double) : Double =
  sqrIter(1.0, x)


sqrt(4.0)
sqrt(2.0)



// **************************
//  GCD - greatest common divisor
def gcd(a: Int, b: Int): Int =
  if(b==0) a else gcd(b, a % b)

