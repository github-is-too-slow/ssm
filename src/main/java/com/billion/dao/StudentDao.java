package com.billion.dao;

import com.billion.entity.Student;

import java.util.List;

/**
 * @author Billion
 * @create 2021-03-05 19:00
 */
public interface StudentDao {
	//插入一个学生信息
	int insertStudent(Student student);

	//查询所有学生信息
	List<Student> selectStudents();
}
