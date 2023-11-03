package com.nhom_6.duan_1.model.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="SanPhamChiTiet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetail extends BaseEntity {
    @Column
    private int soLuong;
    @Column
    private String trangThai;

    @ManyToOne
    @JoinColumn(name="product_id")
    @JsonBackReference
    private Product product;


    @ManyToOne
    @JoinColumn(name="size_id")
    private Size size;

    @ManyToOne
    @JoinColumn(name="color_id")
    private Color color;


    @OneToOne
    @JoinColumn(name="image_id")
    private Image image;
}
