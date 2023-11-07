package com.nhom_6.duan_1.controller.restController;

import com.nhom_6.duan_1.model.entity.Product;
import com.nhom_6.duan_1.service.ProductService;
import com.nhom_6.duan_1.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/product")
public class ProductRest {

    @Autowired
    ProductService productService;

    @Autowired
    SizeService sizeService;
    @GetMapping("/product-details/get-by-size")
    public ResponseEntity<?> getBySize(@RequestParam("sizeName") String sizeName,
                                       @RequestParam("id") Long id
                                       ){
        try {
            return ResponseEntity.ok(productService.getProductDetailBySize(id, sizeName));
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.toString());
        }
    }

    @GetMapping("/product-details/get-size-by-productId")
    public ResponseEntity<?> getSize(@RequestParam("id") Long id){
        try {
            return ResponseEntity.ok(sizeService.getSizeByProductId(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.toString());
        }
    }

}
