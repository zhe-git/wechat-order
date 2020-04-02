package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * @author zhe
 * @date 2020/4/1 23:31
 */
public interface PayService {

    void create(OrderDTO orderDTO);

}
