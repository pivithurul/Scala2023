import scala.annotation.tailrec

object TrailRecursion extends App {

  def factorial(n: Int): Int = {
    if (n == 1)
      1
    else
      n * factorial(n - 1)
  }

  val startTime = System.nanoTime()
  println(factorial(10))
  println(s"Time taken by normal recursion function took ${System.nanoTime() - startTime} nanoSeconds")

  def factorialImproved(n: Int): Int = {
    @tailrec
    def recursion(number: Int, result: Int): Int = {
      if (number == 1)
        result
      else
        recursion(number - 1, number * result)
    }
    recursion(n, 1)
  }

  val startTime1 = System.nanoTime()
  println(factorialImproved(10))
  println(s"Time taken by tail recursion function took ${System.nanoTime() - startTime1} nanoSeconds")

}
