package com.zhidi.entity;

import java.util.Date;

public class Emp {
	
		private Integer empno;
		private String ename;
		private String job;
		private Integer mgr;

		private Date hiredate;
		private Double sal;
		private Double comm;
		
		private Integer deptno;
		private Integer version;
		
		
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
		public Integer getEmpno() {
			return empno;
		}
		public void setEmpno(Integer empno) {
			this.empno = empno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public Integer getMgr() {
			return mgr;
		}
		public void setMgr(Integer mgr) {
			this.mgr = mgr;
		}
		public Date getHiredate() {
			return hiredate;
		}
		public void setHiredate(Date hiredate) {
			this.hiredate = hiredate;
		}
		public Double getSal() {
			return sal;
		}
		public void setSal(Double sal) {
			this.sal = sal;
		}
		public Double getComm() {
			return comm;
		}
		public void setComm(Double comm) {
			this.comm = comm;
		}
		
		@Override
		public String toString() {
			return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate="
					+ hiredate + ", sal=" + sal + ", comm=" + comm +  "]";
		}
		
		
}
