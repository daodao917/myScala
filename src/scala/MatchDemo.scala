package scala

/**
 * Created by yylai on 2015/5/13.
 */
case class Calculator(brand: String, model: String)

object MatchDemo {
	def matchBody1(m: String): Unit = {
		m match {
			case "a" => println("a")
			case "b" => println("b")
			case "c" => println("c")
			case _ => println("error")
		}
	}

	def matchBody2(times: Int): Unit = {
		times match {
			case i if i == 1 => println("one")
			case i if i == 2 => println("two")
			case _ => ""
		}
	}

	def matchBody3(o: Any): Unit = {
		o match {
			case i: Int if i < 0 => println(i - 1)
			case i: Int => println(i + 1)
			case d: Double if d < 0.0 => println(d - 0.1)
			case d: Double => println(d + 0.1)
		}
	}

	def matchBody4(cal: Calculator): Unit = {
		cal match {
			case Calculator("hp", "20GB") => println("financial")
			case Calculator("hp", "48GB") => println("scientific")
			case Calculator("hp", "30GB") => println("business")
			case Calculator(ourBrand, ourModel) => println("Calculator: %s %s is of unknown type".format(ourBrand, ourModel))
		}
	}

	def main(args: Array[String]) {
		matchBody1("a")
		matchBody2(2)
		matchBody3(0.1)
	}
}
