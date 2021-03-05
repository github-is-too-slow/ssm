package com.billion.service.impl;

import com.billion.dao.StudentDao;
import com.billion.entity.Student;
import com.billion.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Billion
 * @create 2021-03-05 19:06
 */
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public int addStudent(Student student) {
		int nums = studentDao.insertStudent(student);
		return nums;
	}

	@Override
	public List<Student> findStudents() {
		List<Student> students = studentDao.selectStudents();
		return students;
	}
}
