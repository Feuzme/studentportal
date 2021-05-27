package com.studentPortal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentPortal.entity.StudentPortalEntity;
import com.studentPortal.service.RegisterService;


public class RegisterServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	boolean sexBoolean;
	 response.setContentType("text/html;charset=UTF-8");
	 PrintWriter out = response.getWriter();
	 String login = request.getParameter("login");
	 String password = request.getParameter("password");
	 String lastName = request.getParameter("lastname");
	 String firstName = request.getParameter("firstname");
	 String sex = request.getParameter("sex");
	 if(sex=="F") {
		 sexBoolean = true;
	 }
	else{
		sexBoolean = false;
	}
	 String birthDate = request.getParameter("birthDate");
	 Date birth = null;
	try {
		birth = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);
	} catch (ParseException e) {		
		e.printStackTrace();
	}
	 String address = request.getParameter("address");
	 Integer postal = ((request.getParameter("postal")!= "") ? Integer.parseInt(request.getParameter("postal")) : 0);
	 
	 String email = request.getParameter("email");
	 String phone = request.getParameter("phone");
	 StudentPortalEntity student = new StudentPortalEntity(login,password,lastName,firstName,sexBoolean,birth,address,postal,email,phone);		
	 try {	
		 RegisterService registerService = new RegisterService();
		 boolean result = registerService.register(student);		
		 out.println("<html>");
		 out.println("<head>");		
		 out.println("<title>Inscription réussie</title>");		
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<center>");
		 if(result){
			 out.println("<h1>Merci pour votre inscription:</h1>");
			 out.println("Pour vous connectez avec les nouveaux identifiants <a href=login.jsp>Cliquez-ici</a>");
		 }else{
			 out.println("<h1>Inscription échouée</h1>");
			 out.println("Pour réessayer : <a href=register.jsp>Cliquez-ici !</a>");
		 }
		 out.println("</center>");
		 out.println("</body>");
		 out.println("</html>");
	 } finally {		
		 out.close();
	 }
}

}