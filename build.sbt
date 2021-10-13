lazy val root = project
  .in(file("."))
  .settings(moduleName := "effekt", name := "effekt")
  .settings(Seq(
    scalaVersion := "3.0.2",
    version := "0.1-DTB",
    organization := "de.b-studios",
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-feature",
      "-unchecked",
      "-language:implicitConversions"
    ),
    test / fork := true,
    Test / parallelExecution := false
  ))

  Global / onChangedBuildSource := ReloadOnSourceChanges
