package com.shop.mall.config;

import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author keven
 * @date 2018-03-09 下午6:02
 * @Description
 */
public class MyFilter extends CharacterEncodingFilter implements Filter {

    @Override
    public void setEncoding(String encoding) {
        super.setEncoding(encoding);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        setEncoding("utf-8");
        super.doFilterInternal(request, response, filterChain);
    }


}
