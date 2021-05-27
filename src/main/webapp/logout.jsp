<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">	
	 <link rel="stylesheet" type="text/css" href="css/style.css">
	 <title>Page de déconnexion</title>
</head>
<body>
	 <%		
		 session.removeAttribute("studentId");
		 session.removeAttribute("password");
		 session.invalidate();
	 %>
<center>
	 <h1>Vous avez réussi à vous déconnecter</h1>
	 Pour vous reconnectez à nouveau : <a href="login.jsp">cliquez-ici</a>.
</center>
</body>
</html>