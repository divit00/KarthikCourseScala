version in ThisBuild := "0.1.0-SNAPSHOT"

scalaVersion in ThisBuild := "2.12.15"


libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.3.2"
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.3.2"

lazy val root = (project in file("."))
  .settings(
    name := "KarthikCourseScala",
    idePackagePrefix := Some("org.example.divit")
  )
