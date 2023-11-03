package com.nhom_6.duan_1.model.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="HoaDonChiTiet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BillDetails extends BaseEntity{
    @Column
    private int soLuongSP;
    @Column
    private double giaSP;
}
