package com.nhom_6.duan_1.repository;

import com.nhom_6.duan_1.model.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductDetailResponsitory extends JpaRepository<ProductDetail,Long> {

    @Query(" SELECT pd FROM ProductDetail pd " +
            " where pd.product.id = :id  and pd.size.nameSize = :sizeName ")
    List<ProductDetail> getProductDetailBySize(@Param("id") Long id, @Param("sizeName") String sizeName);
}
