val scalajHttp = "org.scalaj" %% "scalaj-http" % "2.3.0"
val args4j = "args4j" % "args4j" % "2.33"

val root = (project in file(".")).
  settings(
    name := "scurl",
    libraryDependencies ++= Seq(scalajHttp, args4j)
  )
