
name := "Skeletor-MX"

version := "1.0.1.0-MX-0.1-SNAPSHOT"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
	"org.scala-tools.testing" %% "specs" % "1.6.9" % "test",
	"me.prettyprint" % "hector-core" % "1.0-5" exclude(
      "junit", "junit") exclude("org.slf4j", "slf4j-api"),
	"org.slf4j" % "slf4j-log4j12" % "1.7.2"
)
