package com.example.delet_project.Repositoys;

import com.example.delet_project.Entities.Information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<Information, String> {
}