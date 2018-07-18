<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="SpringMVCClass/resources/css/n_strap.css"
	rel="stylesheet" />
<title>Login Page</title>
</head>
<body>
	<div>
		<h1>Welcome</h1>
		<h3>Please Login</h3>
	</div>
	
	<c:if test="${errorMessage != null }">
		<div><strong>${ errorMessage }</strong></div>
	</c:if>
	
	<form:form action="Login" method="post" commandName="user">
		<form:input path="username" class="form-control"
			placeholder="Username" />
		<form:errors path="username" element="div"></form:errors>
		<br>
		<form:input path="password" class="form-control"
			placeholder="Password"/>
		<form:errors path="password" element="div"></form:errors>
		<br>
		<input type="submit" value="login"/>
			
	</form:form>
	
</body>
</html>