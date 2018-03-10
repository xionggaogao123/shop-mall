package com.shop.mall.config;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author keven
 * @date 2018-03-09 下午5:57
 * @Description
 */

@Configuration
@ComponentScan(basePackages = {"com.shop.mall"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
@MapperScan(basePackages = {"com.endless.dao"})
public class RootConfig {


    public SqlSessionFactory getSqlSessionFactory() {
        DriverManagerDataSource datasource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/test", "root", "root");
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, datasource);
        org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration(environment);
        return new SqlSessionFactoryBuilder().build(config);
    }
}
