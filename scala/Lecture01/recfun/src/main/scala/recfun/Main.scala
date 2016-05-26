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
    //println(countChange(4, List(1,2,3)))
    //println(countChange(4, List(2,3,1)))
    //println(countChange(0, List(1,2,3)))
    //println(countChange(2, List(3,4,5)))
    //println(countChange(20, List(3,4,5)))
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
  def countChange(money: Int, coins: List[Int]): Int = {
    def count(m: Int, c: List[Int]) : Int = {
      if (c.isEmpty) 0
      else if (m - c.head == 0) 1
      else if (m - c.head < 0) 0
      else countChange(m - c.head, c) + countChange(m, c.tail)
    }
    count(money, coins.sorted)
  }

}
