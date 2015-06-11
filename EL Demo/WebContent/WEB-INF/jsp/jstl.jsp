<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.example.el.pojo.*, java.util.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- elVariable name=book value="com.example.el.pojo.Book" --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Book b1 = new Book("Author", "au", "29739287","java",100);
		Book b2 = new Book("dajs", "au", "29739287","java",100);
		Book b3 = new Book("sakjn", "au", "29739287","java",100);
		List<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		request.setAttribute("books", books);
	%>

	<c:out value="${header['ACCEPT'] }"></c:out><br>
	<a href='<c:url value="el" var="elUrl" scope="session">
		<c:param name="requestParam" value="dinesh"></c:param>
		
	</c:url>'>Click Here </a><br>
	
	
	<c:if test="${empty param['dinesh'] }" var="someTestCondition" > 
		${"Paramter dinesh is not available " }<br>
	</c:if>

	<c:if test="${someTestCondition }">
		${"reusing the previous condition" } &nbsp;${someTestCondition}<br/>
	</c:if>
	
	<a href="${ elUrl}">Reused EL URL </a><br>
	
	<c:choose>
		<c:when test="${someTestCondition }">
			this condition might or might not fail
		</c:when>
		<c:when test="${x=0; x>1; x<1 }">
			this condition will fail
		</c:when>	
		<c:otherwise>
			Otherwise block
		</c:otherwise>
	</c:choose>
	<br>
	
	<c:forEach begin="${1}" end="10" step="1" var="i" >
		iteration number: ${i} <br/>
	</c:forEach>
	
	<c:forEach items="${books}" var="i">
		index: ${i.getTitle() }<br>
	</c:forEach>
	<c:forTokens items="${'dinesh,venkat,harsha' }" delims="," var="string">
		${string }<br>
	</c:forTokens>
	
	<c:set var="sampleVar" value="Value for the sample variable set using c:set" scope="request"></c:set>
	
	${sampleVar}
	
	
	
</body>
</html>