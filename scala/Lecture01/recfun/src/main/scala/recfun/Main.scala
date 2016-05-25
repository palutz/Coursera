package recfun

object Main {
  def main(args: Array[String]) {
    /*
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    */
    //val res = balance("(if (zero? x) max (/ 1 x))".toList)
    // val res = balance("())(".toList)
    //val res = balance(":-)".toList)
    //println(s"res=$res")
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    (c, r) match {
      case (c ,r) if (c == 0) || (c == r) => 1
      case (c ,r) if (c < 0) || (c > r ) => 0
      case (_, _) => pascal(c-1, r-1) + pascal(c, r-1)
    }
  }
  
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def counterRec(cList: List[Char], counter: Int, counting: Boolean) : Boolean =
      if(counter >= 0) {
        if(cList.isEmpty) (counting && counter == 0)
        else cList.head match {
          case '(' => counterRec(cList.tail, counter + 1, true)
          case ')' => counterRec(cList.tail, counter -1, true)
          case _ => counterRec(cList.tail, counter, true)
        }
      } else
        false
    counterRec(chars, 0, false)
  }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
