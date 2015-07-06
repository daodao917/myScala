package scala

/**
 * Created by yylai on 2015/6/26.
 */
abstract class AbstractDataSource[T] {
	val element: Seq[T]
}

object AbstractTypeTest1 {
	def main(args: Array[String]) {
		val buf = new AbstractDataSource[Int] {
			override val element: Seq[Int] = List(1, 2, 3)
		}
		println(buf.element.length)
		println(buf.element)
		println(1 :: List(1, 2, 3))
	}
}