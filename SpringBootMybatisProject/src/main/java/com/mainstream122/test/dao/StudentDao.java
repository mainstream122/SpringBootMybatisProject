package com.mainstream122.test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.mainstream122.test.model.StudentMo;

@Mapper
public interface StudentDao {
	
	@Select("SELECT * FROM STUDENT WHERE student_id = #{studentId}")
	StudentMo findByStudentId(@Param("studentId") int studentId);
}
