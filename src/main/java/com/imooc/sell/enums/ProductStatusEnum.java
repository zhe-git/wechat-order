package com.imooc.sell.enums;

import lombok.Getter;

/**
 * product statu
 * @author zhe
 * @date 2020/3/19 22:39
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
