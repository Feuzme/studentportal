<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Page de login</title>

<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

<form method="post" action="LoginServlet">
<div style="padding: 100px 0 0 250px;">


<div id="login-box">

<H2>Page de login</H2>
Veuillez vous identifier pour accéder au site web
<br />
<br />
<div id="login-box-name" style="margin-top:20px;">Student id:</div>
<div id="login-box-field" style="margin-top:20px;">
<input name="id" class="form-login" title="Username" value="" size="30" maxlength="50" />
</div>
<div id="login-box-name">Password:</div>
<div id="login-box-field">
<input name="password" type="password" class="form-login" title="Password" value="" size="30" maxlength="48" />
</div>
<br />
<span class="login-box-options">
Nouvel étudiant ?  <a href="register.jsp" style="margin-left:30px;">S'inscrire ici</a>
</span>
<br />
<br />
<input style="margin-left:100px;" type="submit" value="Se connecter" />
</div>

</div>

</form>

</body>
</html>
