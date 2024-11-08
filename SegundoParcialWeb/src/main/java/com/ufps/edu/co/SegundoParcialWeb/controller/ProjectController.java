package com.ufps.edu.co.SegundoParcialWeb.controller;

import com.ufps.edu.co.SegundoParcialWeb.entity.Project;
import com.ufps.edu.co.SegundoParcialWeb.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public ResponseEntity<ArrayList<Project>> getAll(){
        return ResponseEntity.ok(projectService.getProject());
    }

}
