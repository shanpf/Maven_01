package com.shanpf.test.itf;

import org.apache.ibatis.annotations.Param;

import com.shanpf.test.vo.Order;

public interface IOrderMapper {
	/**
	 * ���ݶ����Ų�ѯ�����û�����Ϣ����������
	 * @param number
	 * @return
	 */
	Order queryOrderWithUserAndDetailByOrderNumber(@Param("number") String number);
}
