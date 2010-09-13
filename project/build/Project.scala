import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {  
  val localMaven   = "Local Maven" at "file://"+Path.userHome+"/.m2/repository"
  val localIvy     = "Local Ivy" at "file://"+Path.userHome+"/.ivy2/local"

  val scalacheck = "org.scala-tools.testing" %% "scalacheck" % "1.7" % "test" withSources()
  val specs      = "org.scala-tools.testing" %% "specs" % "1.6.5" % "test" withSources()
}
