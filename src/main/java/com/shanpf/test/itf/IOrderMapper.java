package com.shanpf.test.itf;

import org.apache.ibatis.annotations.Param;

import com.shanpf.test.vo.Order;

public interface IOrderMapper {
	/**
	 * 根据订单号查询订单用户的信息及订单详情
	 * @param number
	 * @return
	 */
	Order queryOrderWithUserAndDetailByOrderNumber(@Param("number") String number);
}
