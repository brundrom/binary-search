object binarysearch extends App {
  println("Scala prog for bin search v.0.0A")

  val max = 101
  val conList = new Array[Int](max)
  for(a <- 0 until max) {
    conList(a) = a
  }

  def binsearch2(digit: Int): Unit = {
    var iteration = 0
    var low = 0
    var high = max - 1
    while (low <= high) {
      iteration += 1
      val med = (low + high) / 2
      val maybe = conList(med)
      if(maybe == digit) println(iteration) //can change to iteration var
      if(maybe > digit ) high = med - 1
      else low = med + 1
    }
  }

  binsearch2(68)

}