name := "xt_player"

version := "1.0"

scalaVersion := "2.12.4"

organization := "github.com/kilfu0701"

autoScalaLibrary := false

//scalaHome := Some(file("/Program Files (x86)/scala/"))

mainClass in Compile := Some("thk.xtplayer.App")

libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "2.0.0"

libraryDependencies += "com.miglayout" % "miglayout" % "3.7.4"

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.6.4"

libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.5.6"

libraryDependencies += "com.typesafe" % "config" % "1.3.1"

//libraryDependencies ++= Seq(
//    "org.scalatest" % "scalatest_2.10" % "2.0.M5b" % "test"
//)

//EclipseKeys.withSource := true
