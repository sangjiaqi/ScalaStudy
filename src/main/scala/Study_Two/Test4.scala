package Study_Two

object Test4 {

  def main(args: Array[String]): Unit = {

//    1
    val m1 = Map(("ziyun", 20), ("yuxi", 30), ("hongtashan", 10))
    val m2 = for ((k, v) <- m1) yield (k, 0.9 * v)

    println(m1.toString())
    println(m2.toString())

//    2
    val in = new java.util.Scanner(new java.io.File("C:\\Users\\sangjiaqi\\Desktop\\软件\\Scala\\mllib\\test1.txt"))
    while (in.hasNext()) {
      in.next().toString.split(" ").map((_, 1)).groupBy(_._1).mapValues(_.size).foreach(println)
    }

//    3

  }

}