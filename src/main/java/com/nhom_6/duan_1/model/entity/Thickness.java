package com.nhom_6.duan_1.model.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="DoDay")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Thickness extends BaseEntity{
    @Column
    private int dinhLuongGSM;

    @Column
    private Boolean trangThai;

    @OneToMany(mappedBy="thickness")
    private List<Product> products;

}
