package com.monochrome.sell.exception;

import com.monochrome.sell.enums.ResultEnum;

/**
 * @Author: Monochrome
 * @Date: 2018/8/25 22:39
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }



}
