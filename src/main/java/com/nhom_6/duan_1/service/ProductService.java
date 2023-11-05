package com.nhom_6.duan_1.service;

import com.nhom_6.duan_1.model.entity.Product;
import com.nhom_6.duan_1.model.entity.ProductDetail;

import java.util.List;

public interface ProductService {
    List<Product> getProductsBySize(String sizeName,String colorName);

    List<Product> getAllProducts();
    Product getProductById(Long id);

    List<ProductDetail> getProductDetailBySize(Long id, String sizeName);
}
