<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.javatrainig.j2ee.jsp.pojo.Account, java.util.List"%>
    
<%@ include file="/WEB-INF/logout.jsp" %>  

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Total Number of Account(s): ${accounts.size()}<br/>
	
	<c:choose>
		<c:when  test="${accounts.size() eq 0 }">
			<c:out value="${'Currently you dont have any account.' }"/>		
		</c:when>
		<c:otherwise>
			<c:forEach items="${accounts}" var="item">
				<c:out value="${'Account Name: '+= item.accName }"/><br/>
				<c:out value="${'Account Type: '+=item.accType }"/><br/>
				<c:out value="${'Account Balance: '+=item['balance'] }"/><br/>
			</c:forEach>
		</c:otherwise>
	</c:choose>
	
	
	
	<br/>
	<a href="addAccount">Add Accounts</a> <br/>
</body>
</html>