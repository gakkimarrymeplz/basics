package com.zmh.test;

import com.zmh.dao.IUserDao;
import com.zmh.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * mybatis的入门案例使用main函数
 */
public class MybatisTest {
    public static void main(String[] args) throws Exception{

        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建一个SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产一个SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao代理对象
        IUserDao userDao = session.getMapper(IUserDao.class);
        //5.使用代理对象执行方法
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
        
        //6.资源释放
        session.close();
        in.close();
    }
}
