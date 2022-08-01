<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="A"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<center>
		<h1>Login Page</h1>
		<A:form method="POST" action="home" modelAttribute="ver">
			UserName: <A:input path="userName"/>  <A:errors path="userName" cssStyle="color:red"/> <br> <br>
			Password: <A:password path="password"/> <A:errors path="password" cssStyle="color:red"/>
			<br> <br>
			<input type="submit" value="Login">&nbsp;&nbsp; <input type="reset" value="Clear">
		</A:form>
		<br>
		<br>
		<b style="color:red;">${msg}</b>
	</center>
</body>
</html>


