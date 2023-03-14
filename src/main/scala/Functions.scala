

object Functions extends App {
  val list = List(1, 2, 3)

  //Simple function
  def convertToString(num: Int): String = {
    s"$num"
  }

  //Anonymous Functions
  val sum = (a: Int, b: Int) => a + b
  val multiplyByTwo = (x: Int) => x * 2
  val addBraces = (a: Int) => "{" + a.toString + "}"

  //Higher order function
  val printSmart = (f: Int => String, b: Int) => println(f(b))

  def appendTag(data: String): String => String = {
    input: String => s"$input$data"
  }

  //Nested Functions
  def factorial(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }

  //Curring function
  def strCat(s1: String): String => String = (s2: String) => s1 + s2

  val y = convertToString _
  printSmart(y, 6233)
  //  println(sum(3, 2))
  //  println(multiplyByTwo(5))
  printSmart(addBraces, 6)
  val s: String = "abc"
  val s1 = appendTag("def")
  println(s1("345"))
  //  println(list.map(multiplyByTwo))
}
