package scala

/**
 * Created by yylai on 2015/5/13.
 */
object MatchDemo {
  def matchBody(): Unit = {
    val m = "3"
    m match {
      case "a" => println("a")
      case "b" => println("b")
      case "c" => println("c")
      case _ => println("error")
    }
  }

  def main(args: Array[String]) {
    matchBody()
  }
}
