val scala3Version = "3.3.1"


lazy val advent$name;format="camel"$ = (project in file(".")).
  settings(
    name := "$name;format="camel"$",
    version := "$version$",
    description := "$description$ : $name;format="camel"$",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
