val scala3Version = "3.3.1"


lazy val advent$name;format="camel"$ = (project in file(".")).
  settings(
    name := "$name;format="camel"$",
    version := "$version$",
    description := "$description$ : $name;format="camel"$",

    scalaVersion := scala3Version,

    scalacOptions := Seq("-unchecked", "-deprecation"),

    libraryDependencies ++= Seq(
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
      "ch.qos.logback" % "logback-classic" % "1.4.11",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
