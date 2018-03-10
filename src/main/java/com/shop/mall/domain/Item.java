package com.shop.mall.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author keven
 * @date 2018-03-09 下午4:02
 * @Description 商品表
 */
@Data
public class Item implements Serializable{

    private static final long serialVersionUID = 5462814929142870921L;


    private Long id;

    /**
     * 类目id
     */
    private Long categoryId;


    /**
     * 商品名称
     */
    private String name;


    /**标题
     *
     */
    private String subTitle;


    /**
     * 原件
     */
    private float originPrice;

    /**
     * 促销价
     */
    private float promotionPrice;


    /**
     * 库存
     */
    private Integer stock;


    private Date createTime;


    private Date updateTime;
}
