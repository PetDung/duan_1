package com.nhom_6.duan_1.controller.controllers;

import com.nhom_6.duan_1.model.entity.Product;
import com.nhom_6.duan_1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class Home {

    @Autowired
    private ProductService productService;
    @GetMapping("")
    public String index(Model model) {
        try {
            List<Product> productsList = productService.getAllProducts();
            model.addAttribute("productsList", productsList);
        }catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("page","home");
        return "layout/index";
    }
}
