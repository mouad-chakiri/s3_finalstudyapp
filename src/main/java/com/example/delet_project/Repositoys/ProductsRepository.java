package com.example.delet_project.Repositoys;

import com.example.delet_project.Dtos.Test;
import com.example.delet_project.Entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, String> {

}