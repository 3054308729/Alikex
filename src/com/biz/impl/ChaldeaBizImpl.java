package com.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.biz.ChaldeaBiz;
import com.dao.ChaldeaDao;
import com.entity.Chaldea;

@Service
public class ChaldeaBizImpl implements ChaldeaBiz{
	@Resource
	private ChaldeaDao gradeDao;
	/**
	 * 	查询年级所有的信息
	 */
	public List<Chaldea> getAll() {
		
		return gradeDao.getAll();
	}
		
}
