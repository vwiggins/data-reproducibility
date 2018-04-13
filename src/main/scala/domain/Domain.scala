package domain

object Domain {
  case class XmlEntry(subjects: List[Subject], details: List[RepoDetails])

  case class Subject(name: String) extends AnyVal

  case class RepoDetails(label: String, webpage: String)

  val subjectToRepoMapping : Map[String, List[RepoDetails]] =
    Map(
      "health-sciences" -> List(
          RepoDetails("National Database for Clinical Trials related to Mental Illness", "http://ndct.nimh.nih.gov/"),
          RepoDetails("The Cancer Imaging Archive", "http://www.cancerimagingarchive.net/"),
        ),
      "genomics" -> List(
        RepoDetails("The European Genome-phenome Archive", "https://www.ebi.ac.uk/ega/")),
      "protoemics" -> List(
        RepoDetails("The European Genome-phenome Archive", "https://www.ebi.ac.uk/ega/"))
    )
}
