package com.shanpf.test.itf;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shanpf.test.vo.User;

public interface IUserMapper {

	/**
	 * ��¼��ֱ��ʹ��ע��ָ������������ƣ�
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	public User login(@Param("userName") String userName, @Param("password") String password);

	/**
	 * ���ݱ�����ѯ�û���Ϣ��ֱ��ʹ��ע��ָ������������ƣ�
	 * 
	 * @param tableName
	 * @return
	 */
	public List<User> queryUserByTableName(@Param("tableName") String tableName);

	/**
	 * ����Id��ѯ�û���Ϣ
	 * 
	 * @param id
	 * @return
	 */
	public User queryUserById(Long id);

	/**
	 * ��ѯ�����û���Ϣ
	 * 
	 * @return
	 */
	public List<User> queryUserAll();

	/**
	 * �����û���Ϣ
	 * 
	 * @param user
	 */
	public void insertUser(User user);

	/**
	 * ����id�����û���Ϣ
	 * 
	 * @param user
	 */
	public void updateUser(User user);

	/**
	 * ����idɾ���û���Ϣ
	 * 
	 * @param id
	 */
	public void deleteUserById(Long id);
}
