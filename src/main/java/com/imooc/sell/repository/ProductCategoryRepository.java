package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zhe
 * @date 2020/3/19 0:55
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    //根据type的来寻找商品的list
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
