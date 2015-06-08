<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.example.el.servlets.StaticFieldsAndMethodsForELTest, com.example.el.pojo.Book"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	pageContext.setAttribute("page", "pageContext attr");
	session.setAttribute("session", "session attr");
	request.setAttribute("request", "request attr");
	application.setAttribute("application", "context attr");
%>


<body>

	<form action="el" method="get">
		Please enter a value, this will be access using param vairable of EL: <input type="text" name="requestParam"><br/>
		Select from these checkboxes and these will be accessed using paramValues: <br/>
		<input type="checkbox" name="fruits" value="Apple">Apple<br/>
		<input type="checkbox" name="fruits" value="Banana">Banana<br/>
		<input type="checkbox" name="fruits" value="Strawberry">Strawberry<br/>
		<input type="checkbox" name="fruits" value="Orange">Orange<br/>
		<input type="submit" value="Submit">		
	</form>
	____________________________________________________________________________________________________________________<br>
	<h4>String literals and variable assignments in EL</h4><br/>
	This is a string from EL Expression: ${"Hello, from EL Expression"}
	<br /> We can assign a value to variable in EL and the variable value is printed after assignment: ${x = 5}
	<br /> 
	<h4>eq and == in EL</h4><br/>
	In EL eq is same as == which will compare string values(<i><b>NOT REFERENCES</b></i>) :${"eq is same as == in EL" eq "eq is same as == in EL"}<br>
	In EL expression, you need to use += to concate two string: ${"these are two String" += "concated by +=" } <br/>
	In EL you cannot compare Object reference with == ${"double equalto in EL will compare String values. No way in EL to compare object refences" == "double equalto in EL will compare String values. No way in EL to compare object refences"}
	<h4>Calling static methods and fields from EL: </h4><br/>
	${StaticFieldsAndMethodsForELTest.NON_FINAL_STRING}
	<br />
	<!-- We cannot write into static field from EL/JUEL, we can only  access them -->
	${Integer.MAX_VALUE}<br />
	Calling a static method that accepts 'byte' parameter: ${StaticFieldsAndMethodsForELTest.acceptByte(1)}<br/>
	Calling a static method that accepts 'short' parameter:${StaticFieldsAndMethodsForELTest.acceptShort(1)}<br/>
	Calling a static method that accepts 'char' parameter:${StaticFieldsAndMethodsForELTest.acceptChar(66)}<br/>
	<h4>Different ways of accessing properties from EL : </h4><br/>
	<i>Note: We cannot access the public fields directly from EL. We should have getters and setters</i><br/>
	<% StaticFieldsAndMethodsForELTest test = new StaticFieldsAndMethodsForELTest(); %>
	Accessing properties using test["accessProperties From EL"]: ${StaticFieldsAndMethodsForELTest()["accessPropertiesFromEL"]}<br/>
	Accessing properties using test.getAccessProperties From EL: ${StaticFieldsAndMethodsForELTest().getAccessPropertiesFromEL()}<br/>
	You can have mutiple statements in the EL expression separated by ;, all the statements will be evaluated but only the last statement will be ouputed.
	For Ex in the expression &#36;{test=StaticFieldsAndMethodsForELTest(); test["accessPropertiesFromEL"]}, new object is created and the property is accessed in that object: ${test=StaticFieldsAndMethodsForELTest(); test["accessPropertiesFromEL"]="32972"; test["accessPropertiesFromEL"]}
	<br/>
	
	Comparing enums:${val =com.example.servlets.Days.SATURDAY; val == com.example.servlets.Days.SATURDAY }<br/>
	
	<h4>Accessing Values from 11 implicit EL variable</h4><br/>
	Accessing request from pageContext: ${pageContext.request.remoteAddr}<br/>
	Accessing session Id using pageContext.request.session.id = ${pageContext.request.session.id}<br/>
	Accessing attributes from pageScope(values set using pageContext.setAttribute()): ${pageScope["page"]}<br/>
	Accessing attributes from pageScope: ${pageScope["page"]}<br/>
	Accessing attributes from requestScope: ${requestScope["request"]}<br/>
	Accessing attributes from sessionScope: ${sessionScope["session"]}<br/>
	Accessing attributes from applicationScope: ${applicationScope["application"]}<br/>
	page attributes can be simply accessed as &#36;{page_attr_name}:${page}<br/>
	Request attributes can be simply accessed as &#36;{request_attr_name}:${request}<br/>
	session attributes can be simply accessed as &#36;{session_attr_name}:${session}<br/>
	application attributes can be simply accessed as &#36;{application_attr_name}:${application}<br/>
	Accessing single value request parameter using param:${param["requestParam"]}<br/>
	Accessing multi value request parameter using param:${paramValues["fruits"]}<br/>
	Accessing context init parameters using init: ${initParam["contextParam"]}<br/>
	Accessing single value request header using header: ${header["referer"]}<br/>
	Accessing multi value request header using headerValues: ${headerValues["Accept"]}<br/>
	Accessing cookie information using cookie: ${cookie["JSESSIONID"] }<br/>
	
	<h4>Collection Steam API</h4><br/>
	<%-- @elvariable id=books type="java.util.ArrayList"--%>
	<%
		List<Book> books = new ArrayList<>();
		Book b1 = new Book("Core Java", "dinesh", "11312213", "Java",450);
		Book b2 = new Book("Spring IOC", "dinesh", "11312213", "Java,Spring",550);
		Book b3 = new Book("Spring AOP", "dinesh", "11312213", "Java,Spring",550);
		Book b4 = new Book("Spring MVC", "dinesh", "11312213", "Java,Spring",850);
		books.add(b1);
		books.add(b2);
		books.add(b3);
		request.setAttribute("books", books);
		
	%>
	${books.stream().sorted((b1, b2) -> b1.title.compareTo(b2.title)).toList()}<br/>
	${books.stream().filter(b->b.keywords.contains("Spring")).map(b->{ 'title':b.title, 'author':b.author }).toList()}<br/>
	${books.stream().filter(b->b.keywords.contains("Spring")).count() }<br/>
	
	____________________________________________________________________________________________________________________
	
</body>
</html>