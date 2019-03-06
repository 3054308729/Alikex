package com.dao;

import java.util.List;

import com.entity.Student;

/**
 * 	学生类接口
 * @author hp
 *
 */
public interface StudentDao {
	public List<Student> getAll();//查询全部学生信息
	public Integer insert(Student student);//添加学生信息
	public Integer delete(Integer stuId);//根据stuId删除学生信息
	public Integer update(Student student);//更新学生信息
}
