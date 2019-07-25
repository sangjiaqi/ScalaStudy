package Study_Two

import java.time.LocalTime
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Test17 {

  def main(args: Array[String]): Unit = {

    Future {
      Thread.sleep(10000)
      println(s"This is the future at ${LocalTime.now}")
    }

  }

}