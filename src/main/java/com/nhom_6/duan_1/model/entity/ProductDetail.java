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
@Table(name="ProductDetail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetail extends BaseEntity {
    @Column
    private int quantity;
    @Column
    private String status;

    @ManyToOne
    @JoinColumn(name="product_id")
    @JsonBackReference
    private Product product;


    @ManyToOne
    @JoinColumn(name="size_id")
    @JsonBackReference
    private Size size;

    @OneToMany
    @JoinColumn(name = "color_id")
    @JsonManagedReference
    private List<Color> colors;


    @OneToOne
    @JoinColumn(name="image_id")
    private Image image;

    @OneToMany(mappedBy = "productDetail")
    @JsonManagedReference
    private List<BillDetails> billDetails;

    @ManyToOne
    @JsonBackReference
    private ReturnBillDetail returnBillDetail;
}
