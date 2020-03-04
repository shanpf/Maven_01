package com.shanpf.test.itf;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.shanpf.test.vo.Order;

public class IOrderMapperTest {

	public IOrderMapper orderMapper;
	public SqlSession sqlSession;

	@Before
	public void setUp() throws Exception {
		// mybatis-config.xml
		String resource = "config.xml";
		// 读取配置文件
		InputStream is = Resources.getResourceAsStream(resource);
		// 构建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		// 获取sqlSession
		this.sqlSession = sqlSessionFactory.openSession();
		this.orderMapper = this.sqlSession.getMapper(IOrderMapper.class);
		//this.userDao = new UserDAOImpl(sqlSession);
	}
	@Test
	public void queryOrderWithUserByOrderNumber() throws Exception {
	    Order order = orderMapper.queryOrderWithUserAndDetailByOrderNumber("201807010001");
	    System.out.println(order);
	}

}
