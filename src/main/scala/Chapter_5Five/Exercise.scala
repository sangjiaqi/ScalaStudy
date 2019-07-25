package Chapter_5Five

import scala.beans.BeanProperty

object Exercise {

  def main(args: Array[String]): Unit = {



  }

}

class Counter {
  private var value = 0

  def increment(): Unit = {
    if (value < Int.MaxValue) value += 1 else throw new IllegalArgumentException("Beyond the HighBound")
  }

  def current() = value

}

class BankAccount(var balance: Double = 0) {

  def deposit(up: Double): Double = { balance += up; return balance}

  def withdraw(down: Double): Double = { balance -= down; return balance}

}

class Time(val hours: Double, val minutes: Double) {

  def before(other: Time): Boolean = {
    if (this.hours > other.hours) return true
    else if (this.hours == other.hours && this.minutes > other.minutes) true
    else false
  }

  override def toString: String = {
    this.hours + ":" + this.minutes
  }

}

class Student {

  @BeanProperty var name: String = _
//  @BeanProperty val age: Int = _

}

class Person(var age: Int) {
  age = if (age < 0) 0 else age
}

class Person2(var name: String) {
  val firstName: String = name.split(" ")(0)
  val lastName: String = name.split(" ")(1)
}

class Car(val maker:String,val typeName:String){
  private var year: Int = -1
  private var carLice: String = ""

  def this(maker: String, typeName: String, year: Int) {
    this(maker, typeName)
    this.year = year
  }

  def this(maker: String, typeName: String, carLice: String) {
    this(maker, typeName)
    this.carLice = carLice
  }

  def this(maker: String, typeName: String, year: Int, carLice: String) {
    this(maker, typeName)
    this.year = year
    this.carLice = carLice
  }

}

class Employ(val name: String, var salary: Double) {
  def this() { this("John Q. Public", 0.0)}
}

class Employ2 {
  val name: String = "John Q. Public"
  val salary: Double = 0.0
}