package com.shop.mall.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author keven
 * @date 2018-03-09 下午2:22
 * @Description 订单表
 */
@Data
public class Order implements Serializable{

    private static final long serialVersionUID = -9096006134649026558L;

    private Long id;

    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 订单支付时间
     */
    private Date payTime;

    /**
     * 发货时间
     */
    private Date deliveryTime;

    /**
     * 确认收货时间
     */
    private Date confirmTime;

    /**
     * 订单总额
     */
    private double price;

    /**
     * 订单创建时间
     */
    private Date createTime;

    /**
     * 订单更新时间
     */
    private Date updateTime;

}
