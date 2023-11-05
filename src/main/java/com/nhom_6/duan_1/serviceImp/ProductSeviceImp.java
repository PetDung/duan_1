package com.nhom_6.duan_1.serviceImp;

import com.nhom_6.duan_1.model.entity.Product;
import com.nhom_6.duan_1.model.entity.ProductDetail;
import com.nhom_6.duan_1.repository.ProductDetailResponsitory;
import com.nhom_6.duan_1.repository.ProductRepository;
import com.nhom_6.duan_1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSeviceImp implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductDetailResponsitory productDetailResponsitory;

    @Override
    public List<Product> getProductsBySize(String sizeName,String colorName) {
        return productRepository.getProductBySize(sizeName,colorName);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> {
                    throw new RuntimeException("No found!");
                });
    }

    @Override
    public List<ProductDetail> getProductDetailBySize(Long id, String sizeName) {
        return productDetailResponsitory.getProductDetailBySize(id, sizeName);
    }
}
