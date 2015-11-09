package scala

/**
 * Created by yylai on 2015/11/2.
 */
/**
 * scala没有自带的枚举类型，扩展的是标准类库中的Enumeration
 */
object TrafficLightColor extends Enumeration {
	type TrafficLightColorType = Value
	val Red = Value("stop")
	val Yellow = Value("hurry up")
	val Green = Value("go")
}

object EnumDemo extends App {

	import scala.TrafficLightColor._

	/**
	 * 这里的color类型是TrafficLightColor.TrafficLightColorType
	 * 采用模式识别
	 * @param color
	 */
	def doWhat(color: TrafficLightColorType) = {
		println(color match {
			case Red => TrafficLightColor.Red
			case Yellow => TrafficLightColor.Yellow
			case _ => TrafficLightColor.Green
		})
	}

	println(TrafficLightColor.Red)

	doWhat(TrafficLightColor.Green)

	/**
	 * 枚举的遍历方法
	 */
	TrafficLightColor.values.foreach(println)
}
