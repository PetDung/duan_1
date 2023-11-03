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
@Table(name="Size")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Size extends BaseEntity {
    @Column
    private String nameSize;

    @OneToOne(mappedBy = "size")
    private ProductDetail productDetail;
}
