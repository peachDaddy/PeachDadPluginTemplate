package com.github.peachdaddy.peachdadplugintemplate.services

import com.github.peachdaddy.peachdadplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
