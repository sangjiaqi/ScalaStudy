package Chapter_8Eight

object Test1 {

  def main(args: Array[String]): Unit = {



  }

}

class MilTime(val time: Int) extends AnyVal {

  def minutes = time % 100
  def hours = time / 100

}