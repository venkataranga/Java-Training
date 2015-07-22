<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%! String instanceVariable ="Hi"; %>
	<%
		
		if(request.getAttribute("validationErrors")!=null && (Boolean)request.getAttribute("validationErrors")){
			out.println("<i style=\"color: red\">Please enter proper values<i>");
		}else if(request.getAttribute("userNotExists")!=null && (Boolean)request.getAttribute("userNotExists")){
			out.println("<i style=\"color: red\">Please enter valid credentials<i>");
		}else if((Boolean)request.getAttribute("invalidCredentials")!=null && (Boolean)request.getAttribute("invalidCredentials")){
			out.println("<i style=\"color: red\">Please enter valid credentials<i>");
		}
	 
			
	%>
	 Hi
	
	<center>
		<form action="login" method="post">
			Username: <input type="text" name="username">
			Password: <input type="password" name ="password">
			<input type="submit" value="Submit">
		</form>
	</center>
</body>
</html>