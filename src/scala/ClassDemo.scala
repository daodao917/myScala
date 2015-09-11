package scala

/**
 * Created by yylai on 2015/9/8.
 */
trait Cache[K, V] {
	def get(key: K): V

	def put(key: K, value: V)

	def delete(key: K)
}

trait Car {
	val brand: String
}

trait Shiny {
	val shineRefraction: Int
}

class BMW extends Car with Shiny {
	override val brand: String = "BMW"
	override val shineRefraction: Int = 12
}

abstract class Shape {
	def getArea(): Int
}

class Circle(r: Int) extends Shape {
	override def getArea(): Int = 3 * r * r
}

class Calcualte(brand: String) {
	val color: String = if (brand == "TI") {
		"blue"
	} else {
		"red"
	}
}

class ScientificCalculator(brand: String) extends Calcualte(brand) {
	def log(m: Double, base: Double) = math.log(m) / math.log(base)
}

object ClassDemo {
	def main(args: Array[String]) {
		val cal = new ScientificCalculator("TI")
		println(cal.color + ", " + cal.log(10, 2))
	}
}
