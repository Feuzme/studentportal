package com.studentPortal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentPortal.entity.StudentPortalEntity;
import com.studentPortal.service.RegisterService;


public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	boolean sexBoolean;
	 response.setContentType("text/html;charset=UTF-8");
	 PrintWriter out = response.getWriter();
	 String studentId = request.getParameter("id");
	 String login = request.getParameter("login");
	 String password = request.getParameter("password");
	 String lastName = request.getParameter("lastname");
	 String firstName = request.getParameter("firstname");
	 String sex = request.getParameter("sex");
	 if(Integer.parseInt(sex)==0) {
		 sexBoolean = true;
	 }
	else{
		sexBoolean = false;
	}
	 String birthDate = request.getParameter("birthDate");
	 Date birth = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);
	 String adress = request.getParameter("adress");
	 String postal = request.getParameter("postal");
	 String email = request.getParameter("email");
	 String phone = request.getParameter("phone");
	 StudentPortalEntity student = new StudentPortalEntity(Integer.parseInt(studentId),login,password,lastName,firstName,sexBoolean,,adress,Integer.parseInt(postal),email,phone);
			
	 try {	
		 RegisterService registerService = new RegisterService();
		 boolean result = registerService.register(user);		
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