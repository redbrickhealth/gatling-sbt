scalaVersion := "2.10.1"

resolvers += "Local Maven Repository" at file(Path.userHome.absolutePath+"/.m2/repository").toURI.toURL.toString


addSbtPlugin("gatling" %% "gatling-sbt-plugin" % "0.0.1-SNAPSHOT")