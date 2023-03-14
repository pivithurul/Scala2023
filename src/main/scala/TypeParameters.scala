trait Animal
case class Dog() extends Animal
case class Cat() extends Animal

// A single owner has a *specific* pet,
// so it makes sense to declare type at class level
class Owner[A <: Animal] {
  def feed(a: A) = println(s"Owner feed to a ${a.getClass.getName}")
}

// A single RandomAnimalLover walking down the street,
// might feed both Dogs and Cats - so their feed method must be parameterized, and there's no use in adding a parameter at the class level
class RandomAnimalLover {
  def feed[A <: Animal](a: A) = println(s"RandomAnimalLover feed to a ${a.getClass.getName}")
}

object TypeParameters extends App {

  def listOfDuplicates[A](x: A, length: Int): List[A] = {
    if (length < 1)
      Nil
    else
      x :: listOfDuplicates(x, length - 1)
  }
  println(listOfDuplicates[Int](3, 4))  // List(3, 3, 3, 3)
  println(listOfDuplicates("La", 8))  // List(La, La, La, La, La, La, La, La)
  println(listOfDuplicates('X', 5))

  //------------------------------------------------------------------------------
  val dog = Dog()
  val cat = Cat()
  val ownerA = new Owner[Dog]
  val randomDude = new RandomAnimalLover

  ownerA.feed(dog) // compiles
//  ownerA.feed(cat) // does not compile

  randomDude.feed(dog) // compiles
  randomDude.feed(cat) // compiles
}
