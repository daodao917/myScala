package scala

/**
 * Created by yylai on 2015/5/13.
 */

/**
 * 添加了case的类有一下特性：
 * 1. 添加工厂方法，可以通过ClassName("xx")来构建对象
 * 2. 列表中的所有参数都隐式获得了val前缀，当成字段
 * 3. 自动为该类添加了toString,hashCode和equals等方法
 */
abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object Nothing extends Amount

object MatchDemo extends App {
	/**
	 * 常量匹配
	 * @param m
	 */
	def matchBody1(m: String): Unit = {
		println("====常量匹配：====")
		m match {
			case "a" => println("a")
			case "b" => println("b")
			case "c" => println("c")
			case _ => println("error")
		}
	}

	/**
	 * 变量匹配
	 * 如果=>后面需要使用到变量，就不要用通配符_
	 * @param str
	 */
	def matchBody2(str: String): Unit = {
		println("====变量匹配：====")
		str.foreach(c => println(
			c match {
				case ' ' => "space"
				case ch => "Char: " + ch
			}
		))
	}

	/**
	 * 守卫
	 * @param times
	 */
	def matchBody3(times: Int): Unit = {
		println("====守卫：====")
		times match {
			case i if i == 1 => println("one")
			case i if i == 2 => println("two")
			case _ => ""
		}
	}

	/**
	 * 类型模式
	 * 不能匹配Map类型
	 * @param o
	 */
	def matchBody4(o: Any): Unit = {
		println("====类型模式：====")
		o match {
			case i: Int if i < 0 => println(i - 1)
			case i: Int => println(i + 1)
			case d: Double if d < 0.0 => println(d - 0.1)
			case d: Double => println(d + 0.1)
			case m: List[String] => println(m(0))
			case m: Set[String] => println(m)
			case m: Array[String] => println(m(0))
		}
	}

	/**
	 * 样例类匹配
	 * @param amt
	 */
	def matchBody5(amt: Amount): Unit = {
		println("====样例类匹配：====")
		println(amt match {
			case Dollar(v) => "$" + v
			case Currency(v, u) => u + v
			case Nothing => ""
		})
	}

	matchBody1("a")
	matchBody2("Hello world")
	matchBody3(1)
	matchBody4(List("list"))
	matchBody4(Set("set"))
	matchBody4(Array("array"))
	matchBody5(Dollar(10.5))
	matchBody5(Currency(100.2, "RMB"))
}