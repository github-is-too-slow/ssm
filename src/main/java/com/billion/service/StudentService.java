package com.billion.service;

import com.billion.entity.Student;

import java.util.List;

/**
 * @author Billion
 * @create 2021-03-05 19:05
 */
public interface StudentService {
	//添加一个学生
	int addStudent(Student student);

	//查询所有学生信息
	List<Student> findStudents();
}
