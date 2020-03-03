package com.shanpf.test.itf;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.shanpf.test.vo.User;

public class IUserMapperTest {

	public IUserMapper userMapper;

	@Before
	public void setUp() throws Exception {
		// ָ�������ļ�
		String resource = "config.xml";
		// ��ȡ�����ļ�
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// ����sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// ��ȡsqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		// 1. ӳ���ļ��������ռ䣨namespace��������mapper�ӿڵ�ȫ·��
		// 2. ӳ���ļ���statement��id�����mapper�ӿڵķ���������һ��
		// 3. Statement��resultType�����mapper�ӿڷ����ķ�������һ��
		// 4. statement��parameterType�����mapper�ӿڷ����Ĳ�������һ�£���һ����
		this.userMapper = sqlSession.getMapper(IUserMapper.class);
	}

	@Test
	public void testQueryUserByTableName() {
		List<User> userList = this.userMapper.queryUserByTableName("tb_user");
		for (User user : userList) {
			System.out.println(user);
		}
	}

	@Test
	public void testLogin() {
		System.out.println(this.userMapper.login("hj", "123456"));
	}

	@Test
	public void testQueryUserById() {
		System.out.println(this.userMapper.queryUserById(1L));
	}

	@Test
	public void testQueryUserAll() {
		List<User> userList = this.userMapper.queryUserAll();
		for (User user : userList) {
			System.out.println(user);
		}
	}

	@Test
	public void testInsertUser() {
		User user = new User();
		user.setAge(20);
		user.setBirthday("");
		user.setName("����");
		user.setPassword("123456");
		user.setSex(2);
		user.setUser_Name("bigGod222");
		this.userMapper.insertUser(user);
		System.out.println(user.getId());
	}

	@Test
	public void testUpdateUser() {
		User user = new User();
		user.setBirthday("1996-05-16");
		user.setName("����");
		user.setPassword("123456");
		user.setSex(0);
		user.setUser_Name("Jinjin");
		user.setId("2");
		this.userMapper.updateUser(user);
	}

	@Test
	public void testDeleteUserById() {
		this.userMapper.deleteUserById(1L);
	}
}
