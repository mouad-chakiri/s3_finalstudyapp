package com.example.delet_project.Repositoys;

import com.example.delet_project.Entities.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectsRepository extends JpaRepository<Projects, String> {
}