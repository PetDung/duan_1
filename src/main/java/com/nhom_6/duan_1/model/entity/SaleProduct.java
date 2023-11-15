package com.nhom_6.duan_1.model.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="SaleProduct")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleProduct extends BaseEntity {
    @Column
    private double sale;
    @Column
    private String status;
    @Column
    private Date startAt;
    @Column
    private Date endAt;

    @OneToMany(mappedBy = "saleProduct")
    private List<Product> products;
}
