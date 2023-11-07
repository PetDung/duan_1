package com.nhom_6.duan_1.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "VoucherUserBill")
public class VoucherUserBill extends BaseEntity {

    @Column
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "voucher_id")
    @JsonBackReference
    private Voucher voucher;

    @OneToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;

}
