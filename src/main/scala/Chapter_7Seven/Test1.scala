package Chapter_7Seven

package com {
  class T1() {}
  package horstmann {
    class T2(t1: T1) {}
    package impatient {
      class T3(t1: T1, t2: T2) {}

    }
  }
}

//package com.horstmann.impatient {
//  class T4(t1: T1, t2: T2) {}
//}

import java.util.{HashMap => JavaHashMap}

import scala.collection.mutable

object Test1 extends App {
  val JHM = new JavaHashMap[String, Int]()
  JHM.put("a", 1)
  JHM.put("b", 2)
  JHM.put("c", 3)

  val SHM = new mutable.HashMap[String, Int]()

  for (key <- JHM.keySet().toArray()) {
    SHM += (key.toString -> JHM.get(key))
  }

  println(SHM.mkString)

}

import java.lang

object Test extends App{
  var password = Console.readLine()

  if (password equals "secret") System.out.println("Hello " + System.getProperty("user.name"))
  else System.err.println("password error!")
}

