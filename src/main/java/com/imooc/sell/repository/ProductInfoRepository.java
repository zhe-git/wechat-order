package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zhe
 * @date 2020/3/19 21:07
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    // 通过商品的状态查询上架的商品
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
