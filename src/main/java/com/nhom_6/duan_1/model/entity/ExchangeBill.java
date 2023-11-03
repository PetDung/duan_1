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
@Table(name="DoiHang")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeBill extends BaseEntity {
    @Column
    private String moTaLyDo;
}
