package com.billion.controller;

import com.billion.entity.Student;
import com.billion.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Billion
 * @create 2021-03-05 19:14
 */
@Controller
@RequestMapping(value = "/student/")
public class StudentController {
	@Autowired
	private StudentService studentService;

	//注册用户
	@RequestMapping(value = "registerStudent.do")
	public ModelAndView registerStudent(Student student){
		ModelAndView mv = new ModelAndView();
		int nums = studentService.addStudent(student);
		String tips = "注册失败";
		if(nums > 0){
			tips = "学生【" + student.getName() + "】，注册成功";
		}
		mv.addObject("tips", tips);
		mv.setViewName("regisResult");
		return mv;
	}

	//查询用户信息
	@RequestMapping(value = "listStudent.do")
	@ResponseBody
	public List<Student> listStudent(){
		return studentService.findStudents();
	}
}
