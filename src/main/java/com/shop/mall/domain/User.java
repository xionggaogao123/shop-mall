package com.shop.mall.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author keven
 * @date 2018-03-09 下午2:28
 * @Description
 */
@Data
public class User implements Serializable{

    private static final long serialVersionUID = -8853778905012072256L;

    private Long id;

    /**
     * 用户名
     */
    private String name;


    /**
     * 登录密码
     */
    private String password;


    /**
     * 手机号码
     */
    private String mobile;


}
