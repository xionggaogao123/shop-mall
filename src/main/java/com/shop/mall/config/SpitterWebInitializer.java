package com.shop.mall.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author keven
 * @date 2018-03-09 下午5:57
 * @Description
 */
public class SpitterWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        String url = "/";
        System.out.println("指定前置控制器入口:[ " + url + " ]");
        return new String[] { url };
    }
}
