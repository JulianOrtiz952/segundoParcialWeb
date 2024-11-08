package com.ufps.edu.co.SegundoParcialWeb.service;

import com.ufps.edu.co.SegundoParcialWeb.entity.Project;
import com.ufps.edu.co.SegundoParcialWeb.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public ArrayList<Project> getProject(){
        return (ArrayList<Project>) projectRepository.findAll();
    }

}
