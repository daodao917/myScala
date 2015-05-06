package scala

/**
 * Created by yylai on 2015/5/6.
 * source: http://blog.csdn.net/mapdigit/article/details/21878083
 * rational operations
 */
class Rational(n: Int, d: Int) {
	require(d != 0)
	private val g = gcd(n.abs, d.abs)
	private val number = n / g
	private val denom = d / g

	def this(n: Int) = this(n, 1)

	override def toString = n + "/" + d

	def add(that: Rational) = {
		new Rational(n * that.denom + that.number * denom, denom * that.denom)
	}

	private def gcd(a: Int, b: Int): Int = {
		if (b == 0) a else gcd(b, a % b)
	}
}

object Rational {
	def main(args: Array[String]) {
		val r1 = new Rational(1, 3)
		val r2 = new Rational(1, 2)
		print(r1.add(r2))
	}
}