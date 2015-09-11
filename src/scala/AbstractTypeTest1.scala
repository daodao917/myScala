package scala

/**
 * Created by yylai on 2015/6/26.
 */

abstract class AbstractDataSource {
	type T
	val element: Seq[T]
}

class DataSource[S](list: List[S]) extends AbstractDataSource {
	override type T = S
	override val element: Seq[S] = list
}

object AbstractTypeTest1 {
	def addOne(m: Int): Int = m + 1

	def main(args: Array[String]) {
		val buf = new DataSource[Int](List(1, 2, 3))
		println(buf.element.length)
		println(buf.element)
		println(1 :: List(1, 2, 3))
		println(addOne(1))
	}
}