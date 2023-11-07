package com.nhom_6.duan_1.model.entity;
import jakarta.persistence.*;
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

    @OneToOne(mappedBy="thickness")
    private Product product;

}
