package scala

/**
 * Created by yylai on 2015/9/8.
 */
class Foo extends Function1[Int, Int]{
	def fooTest: Unit = {
		println("I'm Class Foo")
	}

	override def apply(v1: Int): Int = v1 + 1
}

object Foo {
	def apply() = new Foo
}

object FooTest extends App{
	println(Foo().fooTest)
}
