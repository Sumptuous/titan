package com.wyy.titan.sys;

import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.core.NestedIOException;

import java.io.IOException;

/**
 * Created by emotion on 3/9/16.
 */
public class TITANSqlSessionFactoryBean extends SqlSessionFactoryBean {
    @Override
    protected SqlSessionFactory buildSqlSessionFactory() throws IOException {
        try {
            return super.buildSqlSessionFactory();
        } catch (NestedIOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            ErrorContext.instance().reset();
        }
    }
}
