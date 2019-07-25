package Chapter_10Ten

import java.awt.Point
import java.awt.geom.Ellipse2D


object  Exercise {
  def main(args: Array[String]): Unit = {

  }
}

trait RectangleLike {
  this: Ellipse2D.Double =>
  def translate(x: Double, y: Double): Unit = {
    this.x = x
    this.y = y
  }
  def grow(x: Double, y: Double): Unit = {
    this.x += x
    this.y += y
  }
}

//class OrderPoint extends Point with Ordered[Point] {
//  def compare(that: Point): Unit = {
//    if (this.x <= that.x && this.y < that.y) -1
//    else if (this.x == that.x && this.y == that.y) 0
//    else 1
//  }
//}

trait Logger {
  def log(str: String, key: Int = 3): String
}

class CryptoLogger extends Logger {
  def log(str: String, key: Int): String = {
    for ( i <- str) yield if (key >= 0) (97 + ((i - 97 + key)%26)).toChar else (97 + ((i - 97 + 26 + key)%26)).toChar
  }
}

