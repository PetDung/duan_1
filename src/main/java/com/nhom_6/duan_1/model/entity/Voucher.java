package com.nhom_6.duan_1.model.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="Voucher")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Voucher extends BaseEntity{
    @Column
    private double saleOf;
    @Column
    private Date createAt;
    @Column
    private Date endAt;
    @Column
    private String status;

    @OneToMany(mappedBy = "voucher")
    private List<VoucherUserBill> voucherUsers;
}
