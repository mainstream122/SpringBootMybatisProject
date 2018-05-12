package com.mainstream122.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainstream122.test.dao.StudentDao;
import com.mainstream122.test.model.StudentMo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public StudentMo findByStudentId(int studentId) {
		return studentDao.findByStudentId(studentId);
	}

}
