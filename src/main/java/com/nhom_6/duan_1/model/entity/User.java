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
@Table(name = "User")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {

    @Column
    private String fullName;

    @Column
    private String email;

    @Column
    private Date dateOfBirth;

    @Column
    private String address;
    @Column
    private String sdt;
    @Column
    private String taiKhoan;
    @Column
    private String matKhau;

    @Column
    private Boolean trangThai;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    @JsonManagedReference
    private List<Role> roles;

    @ManyToMany(mappedBy = "users")
    private List<Voucher> vouchers;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Image image;

    @OneToMany(mappedBy = "user")
    private List<Bill> bills;

    @ManyToMany(mappedBy = "favoritedByUsers")
    private List<ProductFavorite> favoriteProducts;

}
