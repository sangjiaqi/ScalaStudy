package Chapter_10Ten

object Test1 {

  def main(args: Array[String]): Unit = {

  }

}

trait Loggers {
  def logger(msg: String)
}

trait ConsoleLogger extends Loggers {
  def logger(msg: String) {println(msg)}
}

trait TimestampLogger extends ConsoleLogger {
  override def logger(msg: String): Unit = {
    super.logger(s"{java.time.Instant.now()} $msg")
  }
}