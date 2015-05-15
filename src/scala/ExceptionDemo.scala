package scala

import java.io.{IOException, FileNotFoundException, FileReader}

/**
 * Created by yylai on 2015/5/13.
 */
object ExceptionDemo {
  def exception(): Unit = {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("file not found")
      }
      case ex: IOException =>
    }
  }

  def main(args: Array[String]) {
    exception()
  }
}
