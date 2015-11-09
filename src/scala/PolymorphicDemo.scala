package scala

/**
 * Created by yylai on 2015/10/20.
 */
/**
 * 类型推断，可以看做是java中的泛型
 */
class TypeInference {
	def id[T](x: T) = println(x)

	id(1)
	id("a")
}

/**
 * 变性
 */
class Basket1[T](basket: T) {
	println(basket)
}

class Basket2[+T](basket: T) {
	println(basket)
}

class Basket3[-T](basket: T) {
	println(basket)
}

class Fruit(name: String, color: String) {
	def getName(): String = name

	def getColor(): String = color
}

class Apple extends Fruit("Apple", "Red")

/**
 * 边界
 */
class Animal {
	val sound = "animal"
}

class Bird extends Animal {
	override val sound = "call"
}

class Chicken extends Bird {
	override val sound = "cluck"
}

class Bound {
	/**
	 * def cacophony[T <: Bird](things: Seq[T]) = xxx
	 * @param things
	 */
	def cacophony(things: Seq[_ <: Bird]) = things.map(_.sound)
}

object Bound {
	def apply() = new Bound()
}

object PolymorphicDemo extends App {
	/**
	 * [T]
	 * 无论是 Basket[Fruit] = new Basket[Apple]
	 * 还是 Basket[Apple] = new Basket[Fruit]
	 * 都会报错，此种情况称为
	 */
	val basket1: Basket1[Fruit] = new Basket1[Fruit](new Fruit("f", "f"))

	/**
	 * [+T]
	 * 可以使用子类去初始化父类
	 */
	val basket2: Basket2[Fruit] = new Basket2[Apple](new Apple)

	/**
	 * [-T]
	 */
	val basket3: Basket3[Apple] = new Basket3[Fruit](new Fruit("f", "f"))

	/**
	 * 边界限制
	 * 由于传递的类智能是Bird以及Bird的子类
	 * 所以在此处传递Animal是会报错的
	 */
	println(Bound().cacophony(Seq(new Chicken, new Bird)))
}

