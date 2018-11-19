package com.wu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wu.bean.Student;
import com.wu.dao.StudentDAO;



/**
 * This controller routes accesses to the application to the appropriate
 * hanlder methods. 
 *
 */
@Controller
public class StudentController {

	@Autowired
	StudentDAO studentDAO;
	
	@RequestMapping(value="/")
	public ModelAndView listStudent(ModelAndView model) throws IOException{
		System.out.println("In listStudent()");
		List<Student> listStudent =studentDAO.list();
		model.addObject("listStudent", listStudent);
		model.setViewName("home");
		
		return model;
	}
	
	
	@RequestMapping(value = "/newStudent", method = RequestMethod.GET)
	public ModelAndView newStudent(ModelAndView model) {
		Student newStudent = new Student();
		model.addObject("student", newStudent);
		model.setViewName("StudentForm");
		return model;
	}
	
	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute Student student) {
		studentDAO.saveOrUpdate(student);		
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public ModelAndView deleteContact(HttpServletRequest request) {
		int studentId = Integer.parseInt(request.getParameter("id"));
		studentDAO.delete(studentId);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/editStudent", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int studentId = Integer.parseInt(request.getParameter("id"));
		Student student = studentDAO.get(studentId);
		ModelAndView model = new ModelAndView("StudentForm");
		model.addObject("student", student);
		
		return model;
	}
}
