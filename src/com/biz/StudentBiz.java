package com.biz;

import java.util.List;

import com.entity.Student;

/**
 * 	学生表业务层接口
 * @author hp
 *
 */
public interface StudentBiz {
	public List<Student> getAll();//查询全部学生信息
	public Integer insert(Student student);//添加学生信息
	public Integer delete(Integer stuId);//根据stuId删除学生信息
	public Integer update(Student student);//更新学生信息
}
