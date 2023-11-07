package com.nhom_6.duan_1.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ExchangeBillDetail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeBillDetail extends BaseEntity {
    @Column
    private int quantityOfProductsReturned;
    @Column
    private String status;

    @ManyToOne
    @JoinColumn(name="exChangeBill_id")
    private ExchangeBill exchangeBill;
}
