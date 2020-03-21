package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhe
 * @date 2020/3/20 23:04
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    // 按照买家的openid来查询 分页
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
