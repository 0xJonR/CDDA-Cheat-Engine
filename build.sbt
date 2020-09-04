name := "CDDA-Cheat-Engine"

version := "0.1"

scalaVersion := "2.13.3"

lazy val hello = (project in file("."))
  .settings(
    name:="CDDA-Cheat-Engine",
    // https://mvnrepository.com/artifact/org.scalatest/scalatest
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % Test,
    // https://mvnrepository.com/artifact/com.typesafe.play/play-json
    libraryDependencies += "com.typesafe.play" %% "play-json" % "2.9.0" ,
    // https://mvnrepository.com/artifact/org.scalatest/scalatest
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP2" % Test


)