package scala

/**
 * Created by yylai on 2015/6/29.
 */
object ListDemo extends App {
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
