package com.nhom_6.duan_1.model.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="BillDetail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BillDetails extends BaseEntity{
    @Column
    private String quantityUrchased;
    @Column
    private double priceAtTheTimeOfPurchase;

    @ManyToOne
    @JoinColumn(name="bill_id")
    private Bill bill;

    @ManyToOne
    @JoinColumn(name="productDetail_id")
    private ProductDetail productDetail;

}
