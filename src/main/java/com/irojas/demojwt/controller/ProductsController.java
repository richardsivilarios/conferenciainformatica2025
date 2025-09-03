package com.irojas.demojwt.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import com.irojas.demojwt.service.ProductsService;
import java.util.List;
import com.irojas.demojwt.entity.Products;
/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Micuenta oficial：Richard Sivila
 * @since 2025-07-30
 */
@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://locahost:8081"})
 public class ProductsController {
 private final ProductsService productsService;

    @GetMapping("/by-category")
    public List<Products> byCategory(@RequestParam("name") String categoryName) {
        return productsService.getByCategoryName(categoryName);
    }

}
