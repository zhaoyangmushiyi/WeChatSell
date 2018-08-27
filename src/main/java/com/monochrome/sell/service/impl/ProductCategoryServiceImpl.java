package com.monochrome.sell.service.impl;

import com.monochrome.sell.bean.ProductCategory;
import com.monochrome.sell.dao.ProductCategoryDao;
import com.monochrome.sell.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Monochrome
 * @Date: 2018/8/21 15:31
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final ProductCategoryDao productCategoryDao;

    @Autowired
    public ProductCategoryServiceImpl(ProductCategoryDao productCategoryDao) {
        this.productCategoryDao = productCategoryDao;
    }

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return productCategoryDao.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryDao.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryDao.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return productCategoryDao.save(productCategory);
    }
}
