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
@Table(name="GiaoCa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShiftAssignment extends BaseEntity {
    @Column
    private Date endAT;
    @Column
    private String moTa;
    @Column
    private String trangThai;
    @Column
    private double soTienDauCa;
    @Column
    private double soTienCuoiCa;
}
