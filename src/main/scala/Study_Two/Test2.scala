package Study_Two

object Test2 {

  def main(args: Array[String]): Unit = {

//    1
    def signum(num: Double): Int = {
      if (num > 0) {
        return 1
      } else if (num < 0) {
        return -1
      } else {
        return 0
      }
    }

//    2
    //  值为null, 类型为Unit

//    3
    var x = {}
    var y = {}
    x = y = 1

//    4
    for (i <- (0 until 10).reverse) print(i + " ")
    println()

//    5
    def countdown(n: Int): Unit = {
      for (i <- (0 until n).reverse) print(i + " ")
    }

//    6
    def countword(word: String): Long = {
      var code: Long = 1
      for (i <- word.toCharArray) code *= i.toByte
      return code
    }
    println(countword("Hello"))

//    7
    def countword2(word: String): Long = {
      var code: Long = 1
      word.foreach(code *= _.toByte)
      return code
    }
    println(countword2("Hello"))

//    8
    def countword3(word: String): Long = {
      var code: Long = 1
      if (word.length != 0) code = word(0).toByte * countword3(word.substring(1))
      return code
    }
    println(countword3("Hello"))

    //  10
    def mi(x: Double, n: Int): Double = {
      if (n == 0) 1
      else if (n > 0 && n%2 == 0) mi(x, n / 2) * mi(x, n / 2)
      else if (n > 0 && n % 2 == 1) x * mi(x, n - 1)
      else 1 / mi(x, -n)
    }

    //  11

  }

}