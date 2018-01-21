
name := "scalaRepl"

version := "0.1"

scalaVersion := "2.12.4"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)

libraryDependencies ++= Seq(
  // ScalaCheck
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",

  // Slick and slick extensions
  "com.typesafe.play" %% "play-slick" % "3.0.1",
  "com.typesafe.play" %% "play-slick-evolutions" % "3.0.1",
  "com.typesafe.play" %% "play-json-joda" % "2.6.0-RC1",

  // Shapeless
  "com.chuusai" %% "shapeless" % "2.3.2",

  // CSV tools
  "com.github.tototoshi" %% "scala-csv" % "1.3.5"
)