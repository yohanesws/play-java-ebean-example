name := "play-java-ebean-example"

version := "1.0.0-SNAPSHOT"

resolvers += "Artifactory" at "http://192.168.64.1:8381/artifactory/jcenter/"


scalaVersion := "2.12.2"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)
  
libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += "com.h2database" % "h2" % "1.4.194"

libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.mockito" % "mockito-core" % "2.1.0" % Test
testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v")
