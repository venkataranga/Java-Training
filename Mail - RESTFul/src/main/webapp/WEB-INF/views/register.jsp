<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Page</title>
</head>
<body style="background-color: gray;">
	<c:url value="/register" var="register_url" />
	<h1 style="text-align: center;">Welcome to Internal Mail System</h1>
	<form:form action="${register_url}" method="post" commandName="user">

		<table align="center">
			<tr>
				<td>First Name:</td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName" /></td>
			</tr>

			<tr>
				<td>Last Name:</td>
				<td><form:input type="text" path="lastName" /></td>
				<td><form:errors path="lastName" /></td>
			</tr>

			<tr>
				<td>Email:</td>
				<td><form:input type="text" path="email" /></td>
				<td><form:errors path="email" /></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><form:password path="password" /></td>
				<td><form:errors path="password" /></td>
			</tr>

		</table>

		<center><input type="submit" value="Submit" /></center>
		<br />
	</form:form>
</body>
</html>