package com.example.delet_project.Controllers;


import com.example.delet_project.Dtos.CompletProducts;
import com.example.delet_project.Dtos.Test;
import com.example.delet_project.Entities.Products;
import com.example.delet_project.Repositoys.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class MainController {

    @Autowired
    private ProductsRepository productsRepository;

    @GetMapping("main")
    public String index() {
        return "Hello World";
    }

    @GetMapping("products")
    public List<Products> getProducts(){
        return productsRepository.findAll();
    }

}
