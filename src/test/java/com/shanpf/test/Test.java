package com.shanpf.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.shanpf.test.vo.User;

import java.io.InputStream;

public class Test {
	public static void main(String[] args) throws Exception {
		// ָ��ȫ�������ļ�
		String resource = "config.xml";
		// ��ȡ�����ļ�
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// ����sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// ��ȡsqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			// ����CRUD����һ��������ָ��statement�����������ռ�+��.��+statementId
			// �ڶ���������ָ������sql�Ĳ������������û�id
			User user = sqlSession.selectOne("MyMapper.selectUser", 1);
			System.out.println(user);
		} finally {
			sqlSession.close();
		}
	}
}