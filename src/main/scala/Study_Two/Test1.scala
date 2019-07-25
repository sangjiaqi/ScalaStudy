package Study_Two

import scala.math.BigInt
import scala.util.Random

object Test1 {

  def main(args: Array[String]): Unit = {

//    1

//    2

//    3
//    res0变量为val

//    4
    println("crazy" * 3)

//    5
    println(10 max 2)

//    6
    val result: Double = math.pow(2, 1024)
    println(result)

//    7
    println(BigInt.probablePrime(100, Random))

//    8
    println(BigInt(Random.nextInt).toString(36))

//    9
    val word = "Hello"
    println(word(0))
    println(word(word.length - 1))

//    10
    //  take是从字符串首开始获取字符串,drop是从字符串首开始去除字符串。takeRight和dropRight是从字符串尾开始操作。
    // 这四个方法都是单方向的。 如果我想要字符串中间的子字符串，那么需要同时调用drop和dropRight，或者使用substring

  }

}

