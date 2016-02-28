import NativePackagerHelper._

enablePlugins(JavaAppPackaging)

name := """scalaProject"""

version := "1.0"

scalaVersion := "2.11.7"

organization := "com.github.uryyyyyyy"

libraryDependencies += "com.typesafe" % "config" % "1.3.0"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.0-M15" % "test"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.5"

libraryDependencies += "ch.qos.logback" % "logback-core" % "1.1.5"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.18"


mappings in Universal ++= directory("conf")
