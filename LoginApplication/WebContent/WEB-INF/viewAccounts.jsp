<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.javatrainig.j2ee.jsp.pojo.Account, java.util.List"%>
    
<%@ include file="/WEB-INF/logout.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Total Number of Account(S): <% List<Account> acounts = ((List<Account>)session.getAttribute("accounts")); out.print(acounts.size()) ;%>
	<%
		if(acounts.size()==0){
			out.print("Currently you dont have any account.");
		}else {
			for(Account a : acounts){
				out.print("<p>");
				out.print("<Strong> Account Name:</Strong>"+a.getAccName()+"<br/>");
				out.print("<Strong> Account Type:</Strong>"+a.getAccType()+"<br/>");
				out.print("<Strong> Balance:</Strong>"+a.getBalance()+"<br/>");
				out.print("</p>");
			}
		}
	
	%>
	<br/>
	<a href="addAccount">Add Accounts</a> <br/>
</body>
</html>