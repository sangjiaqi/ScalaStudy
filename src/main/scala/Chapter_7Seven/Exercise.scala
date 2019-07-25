package Chapter_7Seven

import scala.collection.mutable.ArrayBuffer

object Exercise {

  def main(args: Array[String]): Unit = {

    val array = new ArrayBuffer[String]()

    array.append("sang")

    println(array.mkString)

  }
}