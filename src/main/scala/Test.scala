object Test extends App {
  //Extractors
  object Doctor {
    def apply(fullName: String) = fullName

    def unapply(fullName: String): Option[String] = {
      if (fullName.nonEmpty)
        Some(fullName.replaceAll("(?<=\\w)(\\w+)", "."))
      else
        None
    }
  }

  def extractors(doctor: Any): String = {
    doctor match {
      case Doctor(initials) => s"My initials are $initials"
      case _ => "Could not extract initials"
    }
  }
  val doctor = Doctor("John Smith")
  println(extractors(doctor))

}
