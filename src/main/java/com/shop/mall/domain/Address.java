package com.shop.mall.domain;

import java.io.Serializable;

/**
 * @author keven
 * @date 2018-03-09 下午2:33
 * @Description
 */
public class Address implements Serializable{

    private static final long serialVersionUID = 276251134023997666L;

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 地址
     */
    private String name;

    /**
     * 邮编
     */
    private String zip;




}
