package com.shop.mall.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author keven
 * @date 2018-03-09 下午2:26
 * @Description
 */
@Data
public class OrderItem implements Serializable{

    private static final long serialVersionUID = -4950750842110798735L;

    private Long id;

    /**
     * 订单Id
     */
    private Long orderId;

    /**
     * 商品id
     */
    private Long itemId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 购买商品的数量
     */
    private Integer number;

}
