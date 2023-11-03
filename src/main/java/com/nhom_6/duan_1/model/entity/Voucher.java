package com.nhom_6.duan_1.model.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="Voucher")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Voucher extends BaseEntity{
    @Column
    private double giamGia;
    @Column
    private Date endAt;
    @Column
    private String trangThai;
}
