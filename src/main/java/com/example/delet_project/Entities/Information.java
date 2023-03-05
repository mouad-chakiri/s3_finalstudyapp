package com.example.delet_project.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table( name = "info") //table
@Data
public class Information {
    @Column(name = "cube_name")
    private @Id String cubeName;
    private String redacteur;
    private String productOwner;
}
