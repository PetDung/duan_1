package com.nhom_6.duan_1.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="SanPhamYeuThich")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductFavorite extends BaseEntity{

    @ManyToMany
    @JoinTable(
            name = "product_favorite_mapping",
            joinColumns = @JoinColumn(name = "product_favorite_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> favoriteProducts;


    @ManyToMany
    @JoinTable(
            name = "user_favorite_products",
            joinColumns = @JoinColumn(name = "product_favorite_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> favoritedByUsers;

    @Column
    private Boolean trangThai;
}
