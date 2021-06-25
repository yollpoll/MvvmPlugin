package com.github.yollpoll.mvvmplugin.services

import com.github.yollpoll.mvvmplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
