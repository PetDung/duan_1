package com.nhom_6.duan_1.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Phieugiamgia_Nguoidung")
public class Voucher_User extends BaseEntity {

    @Column
    private boolean isUsed = false;

    @ManyToOne
    @JoinColumn(name = "nguoidung_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "phieugiamgia_id")
    private Voucher voucher;

}
