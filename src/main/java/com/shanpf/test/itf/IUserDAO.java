package com.shanpf.test.itf;

import java.util.List;

import com.shanpf.test.vo.User;

public interface IUserDAO {

    /**
     * ����id��ѯ�û���Ϣ
     *
     * @param id
     * @return
     */
    public User queryUserById(String id);

    /**
     * ��ѯ�����û���Ϣ
     *
     * @return
     */
    public List<User> queryUserAll();

    /**
     * �����û�
     *
     * @param user
     */
    public void insertUser(User user);

    /**
     * �����û���Ϣ
     *
     * @param user
     */
    public void updateUser(User user);

    /**
     * ����idɾ���û���Ϣ
     *
     * @param id
     */
    public void deleteUser(String id);
}
