package scala

import scala.collection.immutable.SortedMap
import scala.collection.immutable.HashMap

/**
 * Created by yylai on 2015/5/15.
 */
object MapDemo {
  var map = HashMap[Int, String]()
  var sortedMap = SortedMap[Int, String]()
  var triple = ("a", "b", "c")
  var keyArr = Array(1, 2)
  var valArr = Array("a", "b")

  def initMap: Unit = {
    map += (1 -> "1")
    map += (2 -> "2")
    map += (3 -> "3")
  }

  def initSortedMap: Unit = {
    sortedMap += (3 -> "3")
    sortedMap += (2 -> "2")
    sortedMap += (1 -> "1")
  }

  def zipBody: Unit = {
    keyArr.zip(valArr)
  }

  def traverse: Unit = {
    println("foreach: ")
    map.foreach(e => {
      //      val (k, v) = e
      println(e._1 + ": " + e._2)
    })
    println("map(k): ")
    for (k <- map.keySet) {
      println(k + ": " + map(k))
    }
    println("sortedMap: ")
    for ((k, v) <- sortedMap) {
      println(k + ": " + v)
    }
    println("triple: ")
    val (first, second, third) = triple
    println(first + " " + second + " " + third)
  }

  def main(args: Array[String]) {
    initMap
    initSortedMap
    traverse
  }
}
