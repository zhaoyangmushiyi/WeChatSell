package com.monochrome.sell.dto;

import lombok.Data;

/**
 * @Author: Monochrome
 * @Date: 2018/8/26 19:56
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
