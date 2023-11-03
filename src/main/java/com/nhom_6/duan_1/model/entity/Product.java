package com.nhom_6.duan_1.model.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}
