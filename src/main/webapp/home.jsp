<%@page import="com.studentPortal.dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@page import="com.studentPortal.service.LoginService"%>
<%@page import="java.util.Date"%>
<%@page import="com.studentPortal.entity.StudentPortalEntity"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	 <link rel="stylesheet" type="text/css" href="css/style.css"/>
	 <title>Page de résultat</title>	
</head>
<body>
<center>
	 <div id="container">
	 	<p>
		 <h1>Page de résultat</h1>
			 <b>C'est une page de résultat simple</b><br/>
			 <%=new Date()%></br>
			 <%
			 	StudentDto student = (StudentDto) session.getAttribute("student");
			 %>		
			 <b>Bienvenue <%= student.getFirstname() + " " + student.getLastname()%></b>		
			 <br/>
			 <a href="logout.jsp">Se déconnecter</a>
		 </p>

		 <table>
			 <thead>
				 <tr>
					 <th>Student ID</th>
					 <th>First Name</th>
					 <th>Last Name</th>
					 <th>Phone</th>
					 <th>Email</th>					
				 </tr>
			 </thead>
			 <tbody>
				 <%
					 LoginService loginService = new LoginService();
					 List<StudentPortalEntity> list = loginService.getListOfStudents();
					 for (StudentPortalEntity stu : list) {
				 %>
				 <tr>
					 <td><%=stu.getId()%></td>
					 <td><%=stu.getFirstname()%></td>
					 <td><%=stu.getLastname()%></td>
					 <td><%=stu.getPhone()%></td>
					 <td><%=stu.getEmail()%></td>
				 </tr>
				 <%}%>
			 <tbody>
		 </table>		
		 <br/>
	 </div>
	</center>	
</body>
</html>
