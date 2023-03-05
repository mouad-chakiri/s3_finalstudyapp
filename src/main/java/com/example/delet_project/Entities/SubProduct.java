package com.example.delet_project.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "subproduct") //view
@Data
public class SubProduct {
    @Id @Column(name = "catalog_name")
    private String catalogName;
    private String subProductName;
    private @DateTimeFormat String dateMaj;
    private String description;
    private String zone;
}
