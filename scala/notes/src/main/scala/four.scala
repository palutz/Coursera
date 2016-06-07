/**
  * Created by stefano.paluello on 07/06/2016.
  */
object four {
  // natural number only OBJ implementation
  // Peano numbers
  abstract class Nat {
    def isZero : Boolean
    def predecessor : Nat
    def successor : Nat
    def + (that: Nat) : Nat
    def - (that: Nat) : Nat
  }

  object Zero extends Nat {
    override def isZero: Boolean = true
    override def successor: Nat = Succ(this)
    override def predecessor: Nat = throw new Error("0.prtedecessor")
    override def +(that: Nat): Nat = that
    override def -(that: Nat): Nat = if(that.isZero) this else throw new Error("negative number")
  }

  class Succ(n: Nat) extends Nat {
    override def isZero: Boolean = false
    override def successor: Nat = new Succ(this)
    override def predecessor: Nat = n
    override def +(that: Nat): Nat = new Succ(n + that)
    override def -(that: Nat): Nat = if (that.isZero) this else n - that.predecessor
  }
}
