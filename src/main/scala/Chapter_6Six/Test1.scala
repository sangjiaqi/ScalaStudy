package Chapter_6Six

object Test1 {
  def main(args: Array[String]): Unit = {

  }
}

object Accounts {
  private var lastNumber = 0
  def newUniqueNumber = {lastNumber += 1; lastNumber}

  def apply(balance: Double): Accounts = new Accounts(balance)
}

class Accounts {
  val id = Accounts.newUniqueNumber
  private var balance = 0.0
  def this(balance: Double) {
    this()
    this.balance = balance
  }
  def deposit(amount: Double) {balance += amount}
}

abstract class UndoableAction(val description: String) {
  def undo(): Unit
  def redo(): Unit
}

object DoNothingAction extends UndoableAction("Do nothing") {
  override def undo(): Unit = {}
  override def redo(): Unit = {}
}