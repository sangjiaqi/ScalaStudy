package Chapter_1One



import scala.math._
import scala.util.Random

object Exercise {

  def main(args: Array[String]): Unit = {

//  1
    3

//  2
    println(pow(sqrt(3), 2) - 3)

//  3
//  res可以是val也可以是var，具体要看能否更改变量

//  4
    println("crazy" * 3)

//  5
    println(10 max 2)
    println(10.max(2))

//  6
    val result: Double = math.pow(2, 1024)
    println(result)

//  7
    println(BigInt.probablePrime(100, Random))

//  8
    println(BigInt(Random.nextInt).toString(36))

//  9
    val word = "Hello"
    println(word(0))
    println(word(word.length - 1))

//  10
//  take是从字符串首开始获取字符串,drop是从字符串首开始去除字符串。takeRight和dropRight是从字符串尾开始操作。
    // 这四个方法都是单方向的。 如果我想要字符串中间的子字符串，那么需要同时调用drop和dropRight，或者使用substring

  }

}