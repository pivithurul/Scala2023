import scala.util.control.Breaks.{break, breakable}

object OperationOnCollections extends App {

  //map
  val strList = List("Strawberry", "Papaya", "Mango", "Lemon")
  val intList = List(5, 8, 3, 7, 2, 4)
  val chars = Seq('a', 'b', 'c', 'd')


  def f(x: Int): String = if (x % 2 == 0) "Even" else "Odd"

  val multiplyByTwo = (x: Int) => 2 * x

  def func(x: Int): Option[Int] = if (x > 3) Some(x) else None

  //  println("Start of map examples")
  val newList = strList.map(_.+(" Juice"))
    println(newList)

  println(intList.map(elem => elem * 2))
  println(intList.map(func))
  println(chars.map(_.toUpper))

  //  println(intList.map(multiplyByTwo)) // Same thing can be done using intList.map(elem => elem * 2)
  //  println(intList.map(x => f(x)))
  //  println(chars.map(ch => List(ch.toUpper, ch)))
  //  println("End of map examples")
  //  println("------------------------------------------------------------------------------------------")

  //Filter/FilterNot
  println(strList.filter(x => x.startsWith("S")))
  println(strList.filterNot(x => x.startsWith("S")))
  println(intList.filter(x => f(x) == "Odd"))

  //flatMap/flatten
  val listOfLists = List(List(1, 2, 3), List(4, 5, 6), List(3, 2, 1))
  val l = List(1, 2, 3, 4, 5)
  val strList1 = List("ab", "cd", "ef")

  def g(x: Int): List[Int] = List(x - 1, x, x + 1)

  //  println("Start of flatMap examples")
  //  println(listOfLists.flatten)
  //
  //  println(l.map(x => g(x)))
  //  println(l.flatMap(x => g(x)))
  //
  //  println(chars.flatMap(ch => List(ch.toUpper, ch)))

  //  println(intList.map(x => func(x)))
  //  println(intList.flatMap(x => func(x)))
  //  println(strList1.flatMap(_.toUpperCase))
  //  println(strList1.map(_.toUpperCase).flatten)
  //  println("End of flatMap examples")
  //  println("------------------------------------------------------------------------------------------")

  //filter/filterNot
  val charList = List('A', 'b', 'e', 'R', 'H')
  val isEven = (num: Int) => if (num % 2 == 0) true else false
  //val intList = List(5, 8, 3, 7, 2, 4)

  //  println("Start of filter examples")
  //  println(charList.filter(_.isUpper))
  //  println(charList.filterNot(_.isUpper))
  //  println(intList.filter(x => isEven(x)))
  //  println("End of flatMap examples")
  //  println("------------------------------------------------------------------------------------------")

  //fold
  val names = List("John", "Peter", "Smith")
  //  val numbers = List(1, 2, 3)


  //  println("Start of filter examples")
  //  println(names.fold("")(_ + _))
  //  println(names.foldLeft("")(_ + _))
  //  println(names.foldRight("")(_ + _))
  //
  val numbers = List(1, 2, 3)

  //  println(numbers.foldLeft(0)(_ + _))

  //  val result1 = numbers.foldLeft(0) { (res, n) => res + n }
  //  println(result1)
  //  //((0 + 1) + 2) + 3 = 6
  //  println(numbers.foldRight(0)(_ + _))
  //  val result2 = numbers.foldRight(0) { (n, res) => res + n }
  //  println(result2)
  //  //1 + (2 + (3 + 0)) = 6

  case class Employee(name: String, age: Int, gender: String)

  val fooList = Employee("John", 25, "male") ::
    Employee("Anderson", 43, "male") ::
    Employee("Amelia", 37, "female") ::
    Nil

  val stringList = fooList.foldLeft(List[String]()) { (list, employee) =>
    val title = employee.gender match {
      case "male" => "Mr."
      case "female" => "Ms."
    }
    list :+ s"$title ${employee.name}, ${employee.age}"
  }

  val stringList1 = fooList.foldRight(List[String]()) { (employee, list) =>
    val title = employee.gender match {
      case "male" => "Mr."
      case "female" => "Ms."
    }
    list :+ s"$title ${employee.name}, ${employee.age}"
  }
  println(stringList)
  println(stringList1)
  //  println("End of flatMap examples")
  //  println("------------------------------------------------------------------------------------------")

}

