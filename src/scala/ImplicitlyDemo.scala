package scala

/**
 * Created by yylai on 2015/11/6.
 */

class Container[T](value: T) {
	def addIt(implicit v: T =:= Int) = 123 + value
}

object ImplicitlyDemo extends App {
	println(new Container(12).addIt)
}