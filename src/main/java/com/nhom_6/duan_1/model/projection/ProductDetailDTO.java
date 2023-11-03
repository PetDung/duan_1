package com.nhom_6.duan_1.model.projection;

import com.nhom_6.duan_1.model.entity.Image;
import com.nhom_6.duan_1.model.entity.Product;

public class ProductDetailDTO {

    private Long id;
    private double giaSanPham;
    private String moTa;
    private String trangThai;
    private int soLuong;

    private String size;

    private String color;

    private Image image;

    public ProductDetailDTO( Product product) {
         this.id = product.getId();
         this.giaSanPham = product.getGiaSanPham();
         this.moTa = product.getMoTa();
         this.trangThai = product.getTrangThai();
         this.soLuong = product.getProductDetails().getSoLuong();

    }
}
