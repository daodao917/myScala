package scala

import scala.collection.immutable.{SortedMap, HashMap}

/**
 * Created by yylai on 2015/6/29.
 */
object CollectionDemo extends App {
	def listBody(): Unit = {
		val list = List(1, 2, 3, 4)
		val sList = List("abc", "abcd", "abcde", "abcdef")
		println(5 :: list)
		println(list)

		println(sList.count(_.length >= 5))

		println(sList.dropRight(1))

		println(sList.forall(_.startsWith("a")))
		println(sList.foreach(s => println(s)))

		println(sList.head + " " + sList)

		println(sList.init)

		println(sList.sortWith(_.compareTo(_) < 0))
	}

	def setBody(): Unit = {
		val set1 = Set(1, 1, 2, 2)
		val set2 = Set(2, 2, 3, 4)
		// intersect
		println("intersect: " + (set1 intersect set2))
		println("&: " + (set1 & set2))
		// union
		println("union: " + (set1 union set2))
		println("|: " + (set1 | set2))
		println("++: " + (set1 ++ set2))
		// diff
		println("diff: " + (set1 diff set2))
		println("--: " + (set1 -- set2))
		println("&~: " + (set1 &~ set2))

		// add & remove
		println("add: " + (set1 +(4, 5)))
		println("remove: " + (set1 - (1)))
	}

	def tupleBody(): Unit = {
		val hostPort = ("localhost", 80)
		println(hostPort._1 + ":" + hostPort._2)
		("127.0.0.2", 80) match {
			case ("127.0.0.1", 80) => println("local")
			case ("localhost", 80) => println("local")
			case _ => println("other")
		}
	}

	def mapBody(): Unit = {
		var map = Map(1 -> "1", 2 -> "2", 3 -> "3")
		map +=(4 -> "4", 5 -> "5")
		println(map)
		// foreach
		map.foreach(e => {
			println(e._1 + ": " + e._2)
		})
		// keySet
		println("======keySet======")
		for (key <- map.keySet) {
			println(key + ": " + map(key))
		}
	}

	def sortedMapBody: Unit = {
		var map = SortedMap(1 -> "1", 2 -> "2", 3 -> "3")
		map +=(4 -> "4", 5 -> "5")
		for (key <- map.keySet) {
			println(key + ": " + map(key))
		}
	}

	//	listBody()
	//	setBody()
	//	tupleBody()
	//	mapBody()
	sortedMapBody
}
