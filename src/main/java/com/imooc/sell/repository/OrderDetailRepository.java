package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zhe
 * @date 2020/3/20 23:05
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    //先在master里寻找orderid 然后根据id找detail
    List<OrderDetail> findByOrderId(String orderId);
}
