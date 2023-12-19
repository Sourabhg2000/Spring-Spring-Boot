package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/hello")
	public String showPage(Model model)
	{
		//create a student object
		Student s = new Student();
		//add student to container
		model.addAttribute("student", s);
		return "student-form";
	}
	
	/*
	 * @RequestMapping("/processForm") public String
	 * processStudentForm(HttpServletRequest request,Model model) { String
	 * studentName = request.getParameter("txtName"); studentName =
	 * studentName.toUpperCase(); String result = "Hey "+studentName+" Welcome!!!";
	 * model.addAttribute("message", result); return "student-confirmation"; }
	 */
	
	/*
	 * @RequestMapping("/processForm") public String
	 * processStudentForm(@RequestParam("txtName") String studentName,Model model) {
	 * studentName = studentName.toUpperCase(); String result =
	 * "Hey "+studentName+" Welcome to Infoway!!!"; model.addAttribute("message",
	 * result); return "student-confirmation"; }
	 */
	
	@RequestMapping("/processForm")
	public String processStudentForm(@ModelAttribute("student") 
	Student theStudent)
	{
		System.out.println(theStudent);
		return "student-confirmation";
	}
	
}
