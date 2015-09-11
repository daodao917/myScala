package scala

/**
 * Created by yylai on 2015/9/8.
 */

object FunctionDemo extends ((Int, Int, Int) => Int){
	def addOne1(m: Int) = m + 1

	def addOne2 = (m: Int) => m + 1

	def adder(m: Int, n: Int) = m + n

	val add = adder(2, _: Int)

	def capitalizeAll(args: String*) = {
		args.map(_.capitalize)
	}

	def main(args: Array[String]) {
		println(addOne1(1))
		println(addOne2(2))
		println(add(1))
		println(capitalizeAll("aa", "bb", "cc"))
		println(FunctionDemo(1, 2, 3))
	}

	override def apply(v1: Int, v2: Int, v3: Int): Int = v1 + v2 + v3
}
