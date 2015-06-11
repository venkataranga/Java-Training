<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<%! final String PII = "3.14" ;%>
	
	<c:if test="${validationErrors ne null and validationErrors eq true}">
		${"Please enter proper values"}
		
	</c:if>
	<c:if test="${ userExists ne null and userExists eq true}">
		${ "User ID taken"}
	</c:if>
	
	
		<form action="register" method="post">
			First Name: <input type="text" name="firstname"><br/>
			Last Name: <input type="text" name="lastname"><br/>
			Username: <input type="text" name="username"><br/>
			Password: <input type="password" name ="password"><br/>
			<input type="submit" value="Submit"><br/>
		</form>
	</center>
</body>
</html>