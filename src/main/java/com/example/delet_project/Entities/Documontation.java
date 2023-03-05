package com.example.delet_project.Entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "documontation") //table
public class Documontation {
    @Id
    private String catalog_name;
    @Lob
    private byte[] data;
    private String type;
    private String name;
}
