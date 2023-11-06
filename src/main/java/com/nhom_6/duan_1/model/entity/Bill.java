package com.nhom_6.duan_1.model.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="HoaDon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bill extends BaseEntity{
    @Column
    private Date ngayGiao;
    @Column
    private double tongTienHang;
    @Column
    private double thanhTien;
    @Column
    private String trangThai;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy="bill")
    private List<BillDetails> billDetails;

    @OneToOne(mappedBy = "bill")
    private Voucher_User voucherUser;
}
