package com.shanpf.test.vo;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 5423250528202430257L;
	private String id;
	private String user_Name;
	private String password;
	private String name;
	private Integer age;
	private Integer sex;
	private String birthday;
	private String created;
	private String updated;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String geUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
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

	@Override
	public String toString() {
		return "User{" + "id='" + id + '\'' + ", userName='" + user_Name + '\'' + ", password='" + password + '\''
				+ ", name='" + name + '\'' + ", age=" + age + ", sex=" + sex + ", birthday='" + birthday + '\''
				+ ", created='" + created + '\'' + ", updated='" + updated + '\'' + '}';
	}
}