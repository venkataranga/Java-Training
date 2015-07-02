<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: gray;">
	<p style="color: blue;">
		<h4>From: ${mail.from} </h4><br/>
		<h4>To: ${mail.to} </h4><br/>
		<h4>Subject: ${mail.subject} </h4><br/>
		<h4>Message: ${mail.message}</h4>
	</p>
</body>
</html>