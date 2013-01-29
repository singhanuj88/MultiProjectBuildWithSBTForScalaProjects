import sbt._
import Keys._
object SbtMultiBuild extends Build {
    lazy val parent = Project(id = "parent",
                            base = file(".")) aggregate(child1, child2)
    lazy val child1 = Project(id = "child1",
                           base = file("child1"))
    lazy val child2 = Project(id = "child2",
                           base = file("child2"))
}