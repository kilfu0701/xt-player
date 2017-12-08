name := "xt_player"

version := "1.0"

scalaVersion := "2.12.4"

organization := "github.com/kilfu0701"

autoScalaLibrary := false

//scalaHome := Some(file("/Program Files (x86)/scala/"))

mainClass in Compile := Some("thk.xtplayer.App")

libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "2.0.0"

//libraryDependencies += "org.scala-lang" % "scala-swing" % "2.10+"

libraryDependencies += "com.miglayout" % "miglayout" % "3.7.4"

//libraryDependencies ++= Seq(
//    "org.scalatest" % "scalatest_2.10" % "2.0.M5b" % "test"
//)

//EclipseKeys.withSource := true
