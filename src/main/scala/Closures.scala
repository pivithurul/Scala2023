object Function extends App {

  //Function
  val multiplyByTwo = (x: Int) => 2 * x
  val hello = () => "Hello"
  val add = (a: Int, b: Int) => a + b
  def sub(a: Int, b: Int): Int = {a-b}
  def x(f: (Int, Int) => Int, a: Int, b: Int): Unit = {
    println(f(a,b))
  }

  println(multiplyByTwo(5))
  println(add(3, 4))
  println(sub(5,3))
  x(sub, 6, 5)
}

object Closures extends App {
  //Closure
  val factor = 5.2
//  var factor = 6
  val closure1 = (i: Int) => i * factor

  println(closure1(3))
}