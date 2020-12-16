package com.github.godwinjk.timetracker.services

import com.intellij.openapi.project.Project
import com.github.godwinjk.timetracker.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
