package org.paradifference.makeadifference.service;


import org.paradifference.makeadifference.entity.Project;
import org.paradifference.makeadifference.entity.User;
import org.paradifference.makeadifference.repository.ProjectRepository;
import org.paradifference.makeadifference.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService{

    @Autowired
    ProjectRepository projectRepository;

    public List<Project> findAllProjects(){ return projectRepository.findAll();}

    public Project findById(Long id){return projectRepository.findOne(id);}

    public Boolean projectExist(Project project){return projectRepository.equals(project);}

    public void updateProject(Project project){projectRepository.saveAndFlush(project);}

    public void deleteProjectById(Long id){projectRepository.delete(id);}

    public void createProject(Project project){projectRepository.saveAndFlush(project);}
}
