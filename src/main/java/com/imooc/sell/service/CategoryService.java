package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * Category
 * @author zhe
 * @date 2020/3/19 17:46
 */
public interface CategoryService {

    // 找一条
    ProductCategory findOne(Integer categoryId);

    //查询所有
    List<ProductCategory> findAll();

    //通过type查询
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    //新增和更新
    ProductCategory save(ProductCategory productCategory);
}
