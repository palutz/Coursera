/**
  * Created by stefano.paluello on 07/06/2016.
  */
object four {
  // natural number only OBJ implementation
  // Peano numbers
  abstract class Nat {
    def isZero : Boolean
    def predecessor : Nat
    def successor: Nat = new Succ(this)
    def + (that: Nat) : Nat
    def - (that: Nat) : Nat
  }

  object Zero extends Nat {
    override def isZero: Boolean = true
    override def predecessor: Nat = throw new Error("0.prtedecessor")
    override def +(that: Nat): Nat = that
    override def -(that: Nat): Nat = if(that.isZero) this else throw new Error("negative number")
  }

  class Succ(n: Nat) extends Nat {
    override def isZero: Boolean = false
    override def predecessor: Nat = n
    override def +(that: Nat): Nat = new Succ(n + that)
    override def -(that: Nat): Nat = if (that.isZero) this else n - that.predecessor
  }
}

object expression {
  trait Expr
  case class Number(n: Int) extends Expr
  case class Sum(e1: Expr, e2: Expr) extends Expr
  def eval(e: Expr): Int = {
    e match {
      case Number(n) => n
      case Sum(e1, e2) => eval(e1) + eval(e2)
    }
  }
  // receive an expression and return the string representation of the expression
  def show(e: Expr): String = {
    e match {
      case Number(n) => n.toString
      case Sum(e1, e2) => show(e1) + " + " + show(e2)
    }
  }

  show(Sum(Number(1), Number(20)))
}

object List {
  def insert(x: Int, xs: List[Int]) : List[Int] =
    xs match {
      case List() => List(x)
      case y :: ys => if(x <= y) x::xs else y::insert(x, ys)
    }
}