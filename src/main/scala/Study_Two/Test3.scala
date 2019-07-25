package Study_Two

import scala.util.Random

object Test3 {

  def main(args: Array[String]): Unit = {

//    1
    def randomArray(num: Int): Array[Int] = {
      val n = Random.nextInt(num)
      val arr = new Array[Int](n)
      return arr
    }

//    2
    var arr2 = Array(1, 2, 3, 4, 5)
    for (i <- 0 until arr2.length if i %  2 == 0 if i + 1 < arr2.length) {
      val tmp = arr2(i)
      arr2(i) = arr2(i + 1)
      arr2(i + 1) = tmp
    }
    arr2.foreach(print)

//    3
    val newArr = for( i <- Range(0,arr2.length)) yield {
      if (arr2.length % 2 == 1 && i == arr2.length - 1) arr2(i) else if (i % 2 == 0) arr2(i+1) else arr2(i-1)}

//    4
    def execise4(arr:Array[Int]):Array[Int] = {
      var newArr:Array[Int] = for (elem <- arr if elem > 0) yield elem
      val newArr1:Array[Int] = for (elem <- arr if elem <= 0) yield elem
      newArr ++= newArr1
      newArr
    }

    def execise5(arr: Array[Int]): Array[Int] = {
      var ab = arr.toBuffer
      for (i <- 0 until arr.length) {
        if (ab(i) <= 0) {
          var tmp = ab(i)
          ab.remove(i)
          ab.append(tmp)
        }
      }
      ab.toArray
    }

    val arr3 = Array(1, 2, 3, -3, -2, -1, 1, 2, 3)
    println(execise4(arr3).toString)
    println(execise5(arr3).toString)

//    5
    val arr4 = Array[Double](1.0, 2.0, 3.0)
    println(arr4.sum / arr4.length)

//    6
    println(arr3.reverse)

//    7
    println(arr3.distinct)

//    8

  }

}