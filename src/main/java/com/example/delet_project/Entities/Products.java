package com.example.delet_project.Entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;


import java.util.Date;
import java.util.List;
import java.util.Set;


@Immutable
@Table(name = "productv2")  //view
@Entity
@Data
public class Products {

    private @Id String catalog_name;
    private String description;
    private String role;

//    @ManyToOne
//    @JoinColumn(name = "catalog_name", referencedColumnName = "catalog_name")
//    private Documontation docs;

//
//    @ManyToMany
//    @JoinTable(
//            inverseJoinColumns = @JoinColumn(name = "project_code" , referencedColumnName = "project_code" , columnDefinition = "VARCHAR(150)"),
//            joinColumns = @JoinColumn(name = "catalog_name" , referencedColumnName = "catalog_name", columnDefinition = "NVARCHAR(255)")
//    )
//    private Set<Projects> projectsSet;

}
