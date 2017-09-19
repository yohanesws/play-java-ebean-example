resolvers += "Artifactory" at "http://192.168.64.1:8381/artifactory/jcenter/"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.5")

addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "4.0.2")
