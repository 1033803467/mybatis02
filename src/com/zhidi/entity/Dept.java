package com.zhidi.entity;

import java.util.HashSet;
import java.util.Set;

public class Dept {

	private Integer deptno;
	private String dname;
	private String loc;
	private Integer version;
	/*private Set<Emp> emps = new HashSet<Emp>();*/
	
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", version=" + version + "]";
	}
	
}
