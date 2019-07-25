package Chapter_9Nine

import java.io.PrintWriter

import scala.io.Source
import scala.reflect.io.File


object Exercise {

  def main(args: Array[String]): Unit = {

//  1
    val filepathin: String = "E://aiduYunDownload//大数据//spark生态圈//ay28//test1.txt"
    val filepathou: String = "E://aiduYunDownload//大数据//spark生态圈//ay28//test11.txt"

    val file = Source.fromFile(filepathin).getLines().toArray.reverse

    val out = new PrintWriter(filepathou)

    for (i <- file) out.print(i)

    out.close()

//  2
    val filepathin2: String = "E://aiduYunDownload//大数据//spark生态圈//ay28//test2.txt"
    val filepathou2: String = "E://aiduYunDownload//大数据//spark生态圈//ay28//test22.txt"

    val file2 = Source.fromFile(filepathin2).getLines().toArray.map(_.replace("\\t", " "))

    val out2 = new PrintWriter(filepathou2)

    for (i <- file2) out.println(i)

    out2.close()

//  3
    val file3 = Source.fromFile(filepathin).mkString.split("\\s+").filter(_.size > 12).foreach(println)

//  5
    val filepathou3: String = "E://aiduYunDownload//大数据//spark生态圈//ay28//test33.txt"

    val out3 = new PrintWriter(filepathou3)

    for (i <- 0 to 10) {
      println("\\t" + math.pow(2, i) + "\\t" + math.pow(2, 1 / i))
    }

    out3.close()

//  7
    val filepathin4: String = "E://IntelliJ_IDEA_2016.2.5//workspace//Scala_Study//src//main//scala//Chapter_6Six"
    def lookFile(filepath: String): Unit = {
      val file = File(filepath)
      if (file.exists) {
        file.lines()
      }
    }

  }

}