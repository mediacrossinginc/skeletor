organization := "com.mediacrossing"

name := "Skeletor-MX"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
	"me.prettyprint" % "hector-core" % "1.0-5" exclude(
      "junit", "junit") exclude("org.slf4j", "slf4j-api"),
	"org.slf4j" % "slf4j-api" % "1.7.2",
	"com.chuusai" %% "shapeless" % "1.2.3",
	"org.scala-tools.testing" %% "specs" % "1.6.9" % "test",
	"org.slf4j" % "slf4j-log4j12" % "1.7.2" % "test"
	
)

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-language:implicitConversions") 
