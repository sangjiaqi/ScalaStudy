package Chapter_5Five

import scala.collection.mutable.ArrayBuffer

object Test1 {

  def main(args: Array[String]): Unit = {

    val myCounter = new Counter
    myCounter.increment()
    println(myCounter.current())

    val p3 = new Person3("sang", 21, "male",3)

  }

}

class Counters {
  private[this] var value = 0
  def increment() {value += 1}
  def current() = value
}

class Person01 {
  private var privateAge = 0

  def age = privateAge

  def age_=(newValue: Int): Unit = {
    if (newValue > privateAge) privateAge = newValue
  }
}

class Person02() {
  private var name = ""
  private var age = 0

  def this(name: String) {
    this()
    this.name = name
  }

  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }
}

class Person3(val name: String, var age: Int) {
  private var gender: String = null
  private var grade: Int = 0

  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }

  def this(name: String, age: Int, gender: String, grade: Int) {
    this(name, age, gender)
    this.grade = grade

  }
}

class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String) = {
    val m = new Member(name)
    members += m
    m
  }
}