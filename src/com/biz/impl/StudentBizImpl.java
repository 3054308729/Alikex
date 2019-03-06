package com.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.biz.StudentBiz;
import com.dao.StudentDao;
import com.entity.Student;
@Service
public class StudentBizImpl implements StudentBiz{
	@Resource
	private StudentDao stuDao;
	/**
	 * 	查询全部学生信息
	 */
	public List<Student> getAll() {
		
		return stuDao.getAll();
	}

	/**
	 * 	添加学生信息
	 */
	public Integer insert(Student student) {
		
		return stuDao.insert(student);
	}

	/**
	 * 	根据stuId删除学生信息
	 */
	public Integer delete(Integer stuId) {
		
		return stuDao.delete(stuId);
	}

	/**
	 * 	//更新学生信息
	 */
	public Integer update(Student student) {
		
		return stuDao.update(student);
	}
	
}
