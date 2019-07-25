package Chapter_4Four

import scala.io.Source

object Exercise {

  def main(args: Array[String]): Unit = {

//  1
    val m1 = Map(("yusan", 30), ("dami", 10))
    val m2 = m1.keys.zip(m1.values.map(_ * 0.9))

//  2
//    val text = Source.fromFile().mkString()
//    text.split("\r\n").flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.size).foreach(println)

//  3
    



  }

}