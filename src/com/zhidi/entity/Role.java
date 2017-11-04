package com.zhidi.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Role {
	private Integer id;
	private String roleName;
	private Date createTime;
	private Date updateTime;
	// ����Ȩ�޵�����
	private Set<Function> funcs = new HashSet<Function>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Set<Function> getFuncs() {
		return funcs;
	}

	public void setFuncs(Set<Function> funcs) {
		this.funcs = funcs;
	}


}
