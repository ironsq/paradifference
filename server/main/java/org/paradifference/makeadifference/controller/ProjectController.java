package org.paradifference.makeadifference.controller;


import org.paradifference.makeadifference.entity.Project;
import org.paradifference.makeadifference.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @RequestMapping(value = "/projects/", method = RequestMethod.GET)
    public ResponseEntity<List<Project>> getAllProjects(){

        List<Project> projects = projectService.findAllProjects();

        if(projects.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(projects, HttpStatus.OK);
    }





}
