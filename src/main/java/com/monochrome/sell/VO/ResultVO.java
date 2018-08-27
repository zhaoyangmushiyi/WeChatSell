package com.monochrome.sell.VO;

import lombok.Data;

/**
 * http请求返回最外层对象
 * @Author: Monochrome
 * @Date: 2018/8/21 16:22
 */
@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private T data;


}
