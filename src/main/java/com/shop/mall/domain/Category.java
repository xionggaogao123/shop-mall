package com.shop.mall.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author keven
 * @date 2018-03-09 上午11:07
 * @Description 类目
 */
@Data
public class Category implements Serializable{

    private static final long serialVersionUID = 1311675635488442187L;

    private Long id;

    private String name;

    private Integer level;

    private Boolean hasChildren;

    private String logo;

    private Date createTime;

    private Date updateTime;


}
