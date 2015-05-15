package scala

import scala.collection.mutable.ArrayBuffer

/**
 * Created by yylai on 2015/5/13.
 */
object ArrayDemo {
  val array1 = new Array[Int](3)
  // fixed length: array1 = Array(1, 2, 3)
  val array2 = ArrayBuffer[Int]() // variable Array

  def initFixed(): Unit = {
    for (i <- 0 until(array1.length, 1)) {
      // step = 1
      array1(i) = i + 1
    }
  }

  def copyFixed(): Unit = {
    for (i <- 0 until(array1.length, 1)) {
      array1.update(i, array1(i) + 2)
    }
  }

  def initVariable(): Unit = {
    for (i <- 1 to 10) {
      array2 += i
    }
    array2 +=(11, 12, 13)
  }

  def echo(args: String*) {
    args.foreach(arg => println(arg))
  }

  def traverse(arr: Array[_]): Unit = {
    arr.foreach(x => {
      print(x + " ")
    })
    println()
  }

  def main(args: Array[String]) {
    initFixed()
    print("init fixed arr: ")
    traverse(array1)
    print("update fixed arr: ")
    copyFixed()
    traverse(array1)
    initVariable()
    print("init variable arr: ")
    traverse(array2.toArray)
    //    echo(Array("a", "b", "c"): _*)
  }
}
