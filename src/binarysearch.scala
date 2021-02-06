import scala.annotation.tailrec

object binarysearch extends App {
  println("Scala prog for bin search v.0.1A")

  val conList = (0 to 100).toList

  @tailrec
  def binsearch3(conList: List[Int], low: Int, high: Int, find: Int, iterato: Int): (Int, Int) = {
    val med = (low + high) / 2
    val maybe = conList(med)
    if(maybe == find) (med, iterato)
    else if(maybe > find) binsearch3(conList, low, med + 1, find, iterato + 1)
    else binsearch3(conList, med - 1, high, find, iterato + 1)
  }

  val(index, iterat) = binsearch3(conList, 0, conList.length - 1, 30, 0)
  println(s"Finded digit: $index by total iterations: $iterat")
}