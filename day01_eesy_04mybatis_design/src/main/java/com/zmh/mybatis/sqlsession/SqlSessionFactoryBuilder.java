package com.zmh.mybatis.sqlsession;

import com.zmh.mybatis.cfg.Configuration;
import com.zmh.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.zmh.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * 用来创建一个SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {





    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);

    }



}
