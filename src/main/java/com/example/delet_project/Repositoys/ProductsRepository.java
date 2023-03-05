package com.example.delet_project.Repositoys;

import com.example.delet_project.Dtos.ProductsWithMeaseurs;
import com.example.delet_project.Dtos.Test;
import com.example.delet_project.Entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, String> {

//    @Query(nativeQuery = true, value = "SELECT  P.*, M.* FROM viewproducts P INNER JOIN viewmeaseurs M ON P.catalog_name = M.catalog_name")
//    List<ProductsWithMeaseurs> findJoinData();

    @Query("""
            SELECT new com.example.delet_project.Dtos.Test( M , P ) FROM Products P INNER JOIN Measeurs M ON P.catalog_name = M.catalog_name
            """)
    public List<Test> getAllWithAll();

}