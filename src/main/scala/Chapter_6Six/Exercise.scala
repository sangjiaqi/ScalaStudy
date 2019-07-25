package Chapter_6Six

object Exercise {

  def main(args: Array[String]): Unit = {

  }

}

object Conversions {
  def inchesToCentimeters() {}
  def galloneToLiters() {}
  def milesToKilometers() {}
}

abstract class UnitConversion {
  def incheToCentimeters()
  def gallonsToLiters()
  def milesToKilometers()
}

class InchesToCentimeters extends UnitConversion {
  def incheToCentimeters() {println("inchesToCentimeters")}
  def gallonsToLiters() {println("gallonsToLiters")}
  def milesToKilometers() {println("milesToKilometers")}
}

class GallonsToLiters extends UnitConversion {
  def incheToCentimeters() {println("inchesToCentimeters")}
  def gallonsToLiters() {println("gallonsToLiters")}
  def milesToKilometers() {println("milesToKilometers")}
}

class MilesToKilometers extends UnitConversion {
  def incheToCentimeters() {println("inchesToCentimeters")}
  def gallonsToLiters() {println("gallonsToLiters")}
  def milesToKilometers() {println("milesToKilometers")}
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