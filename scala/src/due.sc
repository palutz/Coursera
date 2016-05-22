// HOF - High Order Function
def sumOfFactorials(f: Int => Int, a: Int, b: Int) : Int =
  if(a > b) 0
  else f(a) + sumOfFactorials(f, a+1, b)