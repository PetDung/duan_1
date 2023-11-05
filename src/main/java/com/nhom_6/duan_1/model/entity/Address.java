package com.nhom_6.duan_1.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address extends BaseEntity {
    @Column
    private String tinh;
    @Column
    private String huyen;
    @Column
    private String phuongXa;
    @Column
    private String diaChiChiTien;
    @OneToOne(mappedBy = "address")
    private User user;
}
