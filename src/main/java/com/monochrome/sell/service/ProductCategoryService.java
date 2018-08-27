package com.monochrome.sell.service;

import com.monochrome.sell.bean.ProductCategory;

import java.util.List;

/**
 * 类目service
 * @Author: Monochrome
 * @Date: 2018/8/21 15:27
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);



}
