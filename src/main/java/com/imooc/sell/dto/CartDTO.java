package com.imooc.sell.dto;

import lombok.Data;

/**
 * cart
 * @author zhe
 * @date 2020/3/21 11:01
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
