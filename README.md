MultiProjectBuildWithSBTForScalaProjects
========================================

It can be useful to keep multiple related projects in a single build. If they depend on one another and you tend to modify them together. Each sub-project in a build has its own SBT default directory. It is generate own build and works like any other project.