package com.nhom_6.duan_1.model.entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private double giamGia;
    @Column
    private Date endAt;
    @Column
    private String trangThai;

    @OneToMany(mappedBy = "voucher")
    private List<Voucher_User> voucherUsers;
}
