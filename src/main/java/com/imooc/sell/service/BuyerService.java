package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * @author zhe
 * @date 2020/3/21 17:39
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}

