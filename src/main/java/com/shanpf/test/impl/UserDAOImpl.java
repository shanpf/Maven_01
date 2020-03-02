package com.shanpf.test.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.shanpf.test.itf.IUserDAO;
import com.shanpf.test.vo.User;

public class UserDAOImpl implements IUserDAO {
	public SqlSession sqlSession;

	public UserDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

	@Override
	public User queryUserById(String id) {
		return this.sqlSession.selectOne("UserDao.queryUserById", id);
	}

	@Override
	public List<User> queryUserAll() {
		return this.sqlSession.selectList("UserDao.queryUserAll");
	}

	@Override
	public void insertUser(User user) {
		this.sqlSession.insert("UserDao.insertUser", user);
	}

	@Override
	public void updateUser(User user) {
		this.sqlSession.update("UserDao.updateUser", user);
	}

	@Override
	public void deleteUser(String id) {
		this.sqlSession.delete("UserDao.deleteUser", id);
	}
}
