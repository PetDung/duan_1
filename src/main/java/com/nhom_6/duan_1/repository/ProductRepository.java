package com.nhom_6.duan_1.repository;

import com.nhom_6.duan_1.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

//    @Query(" select p from Product p " +
//            " inner join ProductDetail pd on pd.product = p" +
//            " inner join Size s on s = pd.size" +
//            " inner join Color c on c = pd.color" +
//            " where s.nameSize =:sizeName and c.colorName =:colorName")
//    List<Product> getProductBySize(@Param("sizeName") String sizeName,
//                                    @Param("colorName") String colorName
//                                    );
//    List<Product> findAll();
}
