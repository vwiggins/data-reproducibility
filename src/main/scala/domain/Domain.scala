package domain

object Domain {
  case class Subject(name: String) extends AnyVal

  case class RepoDetails(label: String, webpage: String)

  val subjectToRepoMapping : Map[String, RepoDetails] = Map("test" -> RepoDetails("label", "webpage"))
}
