package com.nhom_6.duan_1.model.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="Bill")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bill extends BaseEntity{
    @Column
    private Date deliveryDate;
    @Column
    private Double totalCost;
    @Column
    private Double intoMoney;
    @Column
    private String status;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy="bill")
    private List<BillDetails> billDetails;

    @OneToOne(mappedBy = "bill")
    private VoucherUserBill voucherUserBill;

    @OneToOne(mappedBy = "bill")
    private UserAddressBill userAddressBill;

    @OneToOne(mappedBy = "bill")
    private ReturnBill returnBill;

    @OneToOne(mappedBy = "bill")
    private ExchangeBill exchangeBill;
}
