name := "Hello Spark"

version := "1.0.0"

scalaVersion := "2.11.12"

val sparkVersion = "2.4.5"

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion
)
