package com.shanpf.test.itf;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.shanpf.test.impl.UserDAOImpl;
import com.shanpf.test.itf.IUserDAO;
import com.shanpf.test.vo.User;

public class IUserDAOTest {

	public IUserDAO userDao;
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
		sqlSession = sqlSessionFactory.openSession();
		this.userDao = new UserDAOImpl(sqlSession);
	}

	@Test
	public void queryUserById() throws Exception {
		System.out.println(this.userDao.queryUserById("1"));
	}

	@Test
	public void queryUserAll() throws Exception {
		List<User> userList = this.userDao.queryUserAll();
		for (User user : userList) {
			System.out.println(user);
		}
	}

	@Test
	public void insertUser() throws Exception {
		User user = new User();
		user. setId("12");
		user.setAge(16);
		user.setBirthday("1990/09/02"); 
		user.setName("大鹏");
		user.setPassword("123456");
		user.setSex(1);
		user.setUser_Name("evan");
		this.userDao.insertUser(user);
		this.sqlSession.commit();
	}

	@Test
	public void updateUser() throws Exception {
		User user = new User();
		user.setBirthday("1990/09/02");
		user.setName("静鹏");
		user.setPassword("654321");
		user.setSex(1);
		user.setUser_Name("evanjin");
		user.setId("1");
		this.userDao.updateUser(user);
		this.sqlSession.commit();
	}

	@Test
	public void deleteUser() throws Exception {
		this.userDao.deleteUser("4");
		this.sqlSession.commit();
	}

}
