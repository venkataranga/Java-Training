<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<%
		if(request.getAttribute("validationErrors")!=null && (Boolean)request.getAttribute("validationErrors")){
			out.println("<i style=\"color: red\">Please enter proper values<i>");
		}else if(request.getAttribute("userExists")!=null && (Boolean)request.getAttribute("userNotExists")){
			out.println("<i style=\"color: red\">User ID taken<i>");
		}
			
	%>
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