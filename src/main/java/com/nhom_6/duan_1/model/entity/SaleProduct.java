package com.nhom_6.duan_1.model.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="SanPhamSale")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleProduct extends BaseEntity {
    @Column
    private double giamGia;
    @Column
    private String trangThai;
    @Column
    private Date ngayKetThuc;

    @OneToOne(mappedBy = "saleProduct")
    private Product product;
}
