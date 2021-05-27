<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Formulaire d'inscription</title>
	<style type="text/css">
h3 {
	font-family: Calibri;
	font-size: 22pt;
	font-style: normal;
	font-weight: bold;
	color: SlateBlue;
	text-align: center;
	text-decoration: underline
}

table {
	font-family: Calibri;
	color: white;
	font-size: 11pt;
	font-style: normal;
	width: 50%;
	text-align:;
	background-color: SlateBlue;
	border-collapse: collapse;
	border: 2px solid navy
}

table.inner {
	border: 0px
}
</style>
</head>
<body>
	<h3>Formulaire d'inscription d'étudiant</h3>
	<form action="RegisterServlet" method="POST">

		<table align="center" cellpadding="10">
			<tr>
				<td>Login</td>
				<td><input type="text" name="login" maxlength="100" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password" maxlength="100" /></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstname" maxlength="30" /> (max
					30 characters a-z and A-Z)</td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastname" maxlength="30" /> (max
					30 characters a-z and A-Z)</td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="text" name="phone" maxlength="100" /></td>
			</tr>
			<tr>
				<td>Mail</td>
				<td><input type="text" name="email" maxlength="100" /></td>
			</tr>
			<tr>
				<td>Postal</td>
				<td><input type="text" name="postal" maxlength="100" /></td>
			</tr>
			<tr>
				<td>Date de naissance</td>
				<td><input type="date" name="birthDate"/></td>
			</tr>
			<tr>
				<td>Sex</td>
				<td>
					Femme
					<input type="radio" value ="F" name="sex"/>
					Homme
					<input type="radio" value ="M" name="sex"/>
				</td>
			</tr>			
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="S'inscrire"> <input type="reset" value="Annuler">
				</td>
			</tr>
		</table>

	</form>

</body>
</html>