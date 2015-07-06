package scala

/**
 * Created by yylai on 2015/6/29.
 */
object GenericDemo extends App {
	val stack = new java.util.Stack[Int]
	stack.push('a')
	stack.push(1)
	println(stack.peek())
	stack.pop()
	println(stack.peek())
}
