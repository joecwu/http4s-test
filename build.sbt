name := "http4s-test"

version := "1.0"

scalaVersion := "2.10.4"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.0"

libraryDependencies += "org.scala-lang.modules" %% "scala-async" % "0.9.0-M4"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.13"

libraryDependencies += "org.clapper" % "grizzled-slf4j_2.10" % "1.0.1"

libraryDependencies += "org.http4s" %% "http4s-core" % "0.4.+"

libraryDependencies += "org.http4s" %% "http4s-dsl" % "0.4.+"

libraryDependencies += "org.http4s" %% "http4s-server" % "0.4.+"

libraryDependencies += "org.http4s" %% "http4s-json4s-jackson" % "0.4.+"

libraryDependencies += "org.http4s" %% "http4s-blazecore" % "0.4.+"

libraryDependencies += "org.http4s" %% "http4s-blazeserver" % "0.4.+"