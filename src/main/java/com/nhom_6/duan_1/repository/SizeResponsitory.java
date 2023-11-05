package com.nhom_6.duan_1.repository;

import com.nhom_6.duan_1.model.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SizeResponsitory extends JpaRepository<Size,Long> {

    @Query( " select s from Size s where s.productDetails. =:id")
    List<Size> findAllByProductDetailsId(Long id);
}
