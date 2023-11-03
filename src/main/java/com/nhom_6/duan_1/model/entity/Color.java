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
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Color extends BaseEntity  {

    @Column
    private String colorName;

    @OneToOne(mappedBy = "color")
    private ProductDetail productDetail;

}