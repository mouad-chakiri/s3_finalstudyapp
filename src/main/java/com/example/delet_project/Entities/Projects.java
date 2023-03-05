package com.example.delet_project.Entities;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "viewprojectss") //view
@Data
public class Projects {
    @Id
    @Column(name="project_code") @Nullable
    private String projectCode;
    private String nom_projet;
    private String description;
    private String area;

//    @ManyToMany(mappedBy = "projectsSet")
//    private Set<Products> productsSet;
}
