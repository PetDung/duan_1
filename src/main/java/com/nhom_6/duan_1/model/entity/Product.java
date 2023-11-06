package com.nhom_6.duan_1.model.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="SanPham")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity {
    @Column
    private String tenSanPham;
    @Column
    private double giaSanPham;
    @Column
    private String moTa;
    @Column
    private String trangThai;

    @OneToMany(mappedBy="product")
    @JsonIgnore
    private List<BillDetails> billDetails;

    @OneToMany(mappedBy="product")
    @JsonManagedReference
    private List<ProductDetail> productDetails;

    @ManyToMany
    @JoinTable(name = "danhmuc_sanpham",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "danhmuc_id"))
    @JsonManagedReference
    private List<Category> categories;

    @ManyToOne
    @JoinColumn(name ="custom_id")
    @JsonIgnore
    private Custom custom;

    @ManyToOne
    @JoinColumn(name ="material_id")
    @JsonIgnore
    private Material material;

    @ManyToOne
    @JoinColumn(name ="thickness_id")
    @JsonIgnore
    private Thickness thickness;

    @OneToOne
    @JoinColumn(name ="sale_id")
    @JsonIgnore
    private SaleProduct saleProduct;

    @OneToMany(mappedBy = "product")
    private List<ProductFavorite> favoritedByUsers;

}
