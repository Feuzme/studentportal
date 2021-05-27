package com.studentPortal.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentPortal.dto.StudentDto;
import com.studentPortal.entity.StudentPortalEntity;
import com.studentPortal.service.LoginService;


public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

	 String studentId = request.getParameter("id");	
	 String password = request.getParameter("password");
	 LoginService loginService = new LoginService();
	 boolean result = loginService.authenticateStudent(Integer.parseInt(studentId), password);
	 
	 if(result == true){
		 StudentPortalEntity studentEntity = loginService.getStudentByStudentId(Integer.parseInt(studentId));
		 StudentDto student = studentEntity.toStudentDto();
		 
		 request.getSession().setAttribute("student", student);		
		 response.sendRedirect("home.jsp");
	 }
	 else{
		 response.sendRedirect("error.jsp");
	 }
	}

}