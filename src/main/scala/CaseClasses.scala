import java.lang.Object

class Student(name: String, age: Int) {
  def getName(): String = {
    this.name
  }
//  def getAge(): Int = {
//    this.age
//  }
}

//val student = Student("John", 25)

//object Student {
//  def apply(name: String, age: Int): Worker = {
//    Worker(name, age)
//  }
//}
//
//case class Worker(name: String, age: Int)
//
//  def unapply(arg: Student): Option[(String, Int)] = {
//    Option(arg.name(),arg.age())
//  }
//}

//An object is a class that has exactly one instance. It is created lazily when it is referenced
//object Logger {
//  def info(message: String): Unit = println(s"INFO: $message")
//}

//case keyword, identifier and optional parameters
case class Customer(id: Int, name: String)
case class Employee(id: Int, name: String)

object CaseClasses extends App {
  val student1 = new Student("Kamal", 23)
  val student2 = new Student("Kamal", 23)
  val customer1 = Customer(1, "John")
  val customer2 = Customer(name = "Peter", id = 2)
  val customer3 = customer1.copy(id = 3)
  val customer4 = Customer(2, "Peter")
  val employee = Employee(11, "John")
  val employee2 = Employee(12, "John")

  val result = student1 match {
    case s: Student => s.getName()
    case _ => "Nothing matched"
  }

//  println(customer3.toString)
//  println(customer2.equals(customer4))
  val emp = employee2.copy(id = 11)
  println(employee==emp) //499918002
//  println(employee)
  println(employee)
  //  println(student1==student2)
  //  println(customer1.toString)
}


//Class and companion object
class Obj(id: Int) {
  def getId(): Int = {
    id
  }
}
object Obj {
  def apply(id: Int): Obj = new Obj(id)
}

