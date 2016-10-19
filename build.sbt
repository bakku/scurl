val scalajHttp = "org.scalaj" %% "scalaj-http" % "2.3.0"

val root = (project in file(".")).
  settings(
    name := "scurl",
    libraryDependencies += scalajHttp
  )
