package com.nhom_6.duan_1.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "UserAddressBill")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAddressBill extends BaseEntity{

    @OneToOne
    @JoinColumn(name="address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    @OneToOne
    @JoinColumn(name="bill_id")
    private Bill bill;

    @Column
    private String trangThai;
}
