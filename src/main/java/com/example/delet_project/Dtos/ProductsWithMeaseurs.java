package com.example.delet_project.Dtos;

import com.example.delet_project.Entities.Products;
import lombok.Data;

@Data
public class ProductsWithMeaseurs {

    private Products products;
    private Measeurs measeurs;

}
