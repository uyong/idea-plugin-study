package com.github.uyong.ideapluginstudy.services

import com.intellij.openapi.project.Project
import com.github.uyong.ideapluginstudy.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
