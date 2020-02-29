package com.zmh.mybatis.sqlsession.defaults;

import com.zmh.mybatis.cfg.Configuration;
import com.zmh.mybatis.sqlsession.SqlSession;
import com.zmh.mybatis.sqlsession.SqlSessionFactory;

/**
 * SqlSessionFactory接口的实现类
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg) {
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的数据库对象
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
