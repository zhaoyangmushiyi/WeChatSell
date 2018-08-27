package com.monochrome.sell.service;

import com.monochrome.sell.bean.ProductInfo;
import com.monochrome.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author: Monochrome
 * @Date: 2018/8/21 15:53
 */
public interface ProductInfoService {

    ProductInfo findOne(String productId);

    /**
     * @return 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo ProductInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
