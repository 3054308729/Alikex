package com.entity;

import java.util.Date;

/**
 * 	学生表实体类
 * @author hp
 *
 */
public class Student {
	private Integer stuId;
	private String stuName;
	private String stuSex;
	private Integer stuAge;
	private Date stuBirthday;
	//外键字段在实体类中，定义为引用对象
	private Chaldea chaldea = new Chaldea();
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public Integer getStuAge() {
		return stuAge;
	}
	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}
	
	public Date getStuBirthday() {
		return stuBirthday;
	}
	public void setStuBirthday(Date stuBirthday) {
		this.stuBirthday = stuBirthday;
	}
	
	
	public Chaldea getChaldea() {
		return chaldea;
	}
	public void setChaldea(Chaldea chaldea) {
		this.chaldea = chaldea;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuAge=" + stuAge
				+ ", stuBirthday=" + stuBirthday + ", chaldea=" + chaldea + "]";
	}

}
