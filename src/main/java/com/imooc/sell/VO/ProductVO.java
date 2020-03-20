package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * product(contain category)
 * @author zhe
 * @date 2020/3/20 12:55
 */
@Data
public class ProductVO {

    // 这个注解是为了返回前端时返回的命名是name不是categoryname
    // 这里设置categoryname是为了不与后面的那么弄混
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
