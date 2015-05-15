package scala

import java.io.{FileReader, IOException, FileNotFoundException, File}

/**
 * Created by yylai on 2015/5/7.
 */
object FileDemo {
  val file = new File(".")
  val fileList = file.listFiles
  val increase = (x: Int) => x + 1

  // array
  val array1 = new Array[Int](3)

  def listAll = {
    println("current path: " + file.getAbsolutePath)
    for (f <- fileList)
      println(f)
  }

  def listFilterEndWith(s: String) = {
    println("current path: " + file.getAbsolutePath)
    val arr = for {
    //      f <- fileList
    //         if file.isFile
    //		     if file.getName.endsWith(s)
      file <- fileList
    //      file if file.getName.endsWith(s)
    } yield file.getName
    arr.foreach(println)
  }

  def main(args: Array[String]) {
    //    listFilterEndWith(".iml")
    println(increase(1))
  }
}
