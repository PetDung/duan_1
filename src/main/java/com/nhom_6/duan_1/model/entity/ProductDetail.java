package com.nhom_6.duan_1.model.entity;
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
    private Product product;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="size_id")
    private Size size;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="color_id")
    private Color color;

    @OneToOne
    @JoinColumn(name="image_id")
    private Image image;
}
