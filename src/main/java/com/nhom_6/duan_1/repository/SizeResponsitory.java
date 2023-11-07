package com.nhom_6.duan_1.repository;

import com.nhom_6.duan_1.model.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SizeResponsitory extends JpaRepository<Size,Long> {

    @Query(" SELECT distinct s FROM Size s" +
            " JOIN s.productDetails pd on pd.size.id = s.id " +
            " where pd.product.id = :id ")
    List<Size> findAllByProductDetailsId(Long id);
}
