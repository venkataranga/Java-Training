<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ include file="/WEB-INF/logout.jsp" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addAccount" method="post">
		Account Name: <input type="text" name="accountName"><br/>
		Account Type: <input type="text" name="accountType"><br/>
		Balance:  <input type="text" name="balance"><br/>
		<input type="submit" value="Submit"><br/>
	</form>
	<br/>
	<a href="viewAccounts">View Account</a>
</body>
</html>