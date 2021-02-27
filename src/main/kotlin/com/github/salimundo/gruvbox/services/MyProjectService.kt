package com.github.salimundo.gruvbox.services

import com.github.salimundo.gruvbox.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
