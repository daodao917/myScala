package scala

/**
 * Created by yylai on 2015/10/20.
 */
class Animal {
	val sound = "animal"
}

class Bird extends Animal {
	override val sound = "bird"
}

class Chicken extends Bird {
	override val sound = "chicken"
}

object BoundDemo extends App {
	def biophony[T <: Animal](things: Seq[T]) = things map (_.sound)

	biophony(Seq(new Chicken, new Bird))
}
