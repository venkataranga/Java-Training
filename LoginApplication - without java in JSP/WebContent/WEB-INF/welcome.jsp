<%@ page language="java" contentType="text/html"
    pageEncoding="UTF-8" import=" com.javatrainig.j2ee.jsp.pojo.User"%>
 <%@ include file="/WEB-INF/logout.jsp" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String fromServlet = request.getAttribute("from").toString();
		User user = (User)request.getAttribute("user");
		if(fromServlet.equalsIgnoreCase("loginServlet"))
			out.println("Hello "+ user.getFirstName()+" "+user.getLastName()+", welcome back ");
		else
			out.println("Hello "+ user.getFirstName()+" "+user.getLastName()+", you have successfully registered ");
	
	%>
	
	<br/><a href="viewAccounts">View Accounts</a> <br/>
	<a href="addAccount">Add Accounts</a>
	
</body>
</html>