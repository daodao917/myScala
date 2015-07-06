package scala

/**
 * Created by yylai on 2015/7/6.
 */
object OptionDemo {
	def toInt(in: String): Option[Int] = {
		try {
			Some(Integer.parseInt(in.trim))
		} catch {
			case e: NumberFormatException => None
		}
	}

	def main(args: Array[String]) {
		println(List("1", "2", "3", "a").flatMap(toInt(_)).length)
	}
}
