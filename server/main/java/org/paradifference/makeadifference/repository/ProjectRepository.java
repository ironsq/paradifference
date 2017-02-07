package org.paradifference.makeadifference.repository;

import org.paradifference.makeadifference.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
