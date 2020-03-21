package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;

/**
 * @author zhe
 * @date 2020/3/21 2:50
 */

public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
