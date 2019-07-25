package Study_Two

object Test6 {

  def main(args: Array[String]): Unit = {



  }

}

object Conversions {
  def inchesToCentimeters() {}
  def galloneToListers() {}
  def milesToKilometers() {}
}

abstract class UnitConversion {
  def inchesToCentimeters()
  def galloneToLiters()
  def milesToKilometers()
}

class InchesToCentimeters extends UnitConversion{
  override def inchesToCentimeters(): Unit = {println("inchesToCentimers")}

  override def galloneToLiters(): Unit = {println("galloneToLiters")}

  override def milesToKilometers(): Unit = {println("milesToKilometers")}
}

class Point(x: Int, y: Int) {
  override def toString: String = "x = " + x + "y = " + y
}

object Point {
  def apply(x: Int, y: Int): Unit = {
    new Point(x, y)
  }

  def main(args: Array[String]): Unit = {
    val p = Point(1, 2)
    println(p)
  }
}