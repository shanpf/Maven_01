package com.shanpf.test.vo;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
	private static final long serialVersionUID = 2311259373535480300L;
	private Integer id;
	private String userId;
	private String orderNumber;
	private String created;
	private String updated;
	private User user;
	private List<OrderDetail> detailList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderDetail> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<OrderDetail> detailList) {
		this.detailList = detailList;
	}

	@Override
	public String toString() {
		return "Order {id=" + id + ", userId=" + userId + ", orderNumber=" + orderNumber + ", created=" + created
				+ ", updated=" + updated + ", user=" + user + ", detailList=" + detailList + "}";
	}

}