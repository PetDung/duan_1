package com.nhom_6.duan_1.controller.controllers;

import com.nhom_6.duan_1.model.entity.Product;
import com.nhom_6.duan_1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping("/product-details")
    public String getProductDetails(Model model, @RequestParam("id") Long id) {
        Product product = new Product();
        try {
            product = productService.getProductById(id);
        }catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("product",product);
        model.addAttribute("page","product-details");
        return "layout/index";
    }
}
