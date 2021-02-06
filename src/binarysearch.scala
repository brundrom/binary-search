object binarysearch extends App {
  println("Scala prog for bin search v.0.0A")

  val max = 100

  def binsearch(digit: Int): Unit = {
    var i = 0
    while (i <= digit) {
      if(digit == max)
      println(i)
      i += 1
    }
  }



  binsearch(56)

}