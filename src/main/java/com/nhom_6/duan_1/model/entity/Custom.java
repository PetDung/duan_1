package com.nhom_6.duan_1.model.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Custom")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Custom extends BaseEntity {
    @Column
    private String nameCustom;

    @OneToMany(mappedBy="custom")
    private List<Product> products;

}
