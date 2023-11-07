package com.nhom_6.duan_1.model.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity {
    @Column
    private String nameProduct;
    @Column
    private double productPrice;
    @Column
    private String description;
    @Column
    private String status;


    @OneToMany(mappedBy="product")
    @JsonManagedReference
    private List<ProductDetail> productDetails;

    @ManyToMany
    @JoinTable(name = "product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    @JsonManagedReference
    private List<Category> categories;

    @OneToOne
    @JoinColumn(name="custome_id")
    @JsonBackReference
    private Custom custom;

    @OneToOne
    @JoinColumn(name = "material_id")
    @JsonBackReference
    private Material material;

    @OneToOne
    @JoinColumn(name ="thickness_id")
    @JsonIgnore
    private Thickness thickness;

    @OneToOne
    @JoinColumn(name ="sale_id")
    @JsonIgnore
    private SaleProduct saleProduct;

    @OneToOne(mappedBy = "product")
    private ProductFavorite productFavorite;

}
