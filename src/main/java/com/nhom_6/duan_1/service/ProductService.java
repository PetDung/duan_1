package com.nhom_6.duan_1.service;

import com.nhom_6.duan_1.model.entity.Product;
import com.nhom_6.duan_1.model.entity.ProductDetail;

import java.util.List;

public interface ProductService {

    List<Product> getProductActive();
}
