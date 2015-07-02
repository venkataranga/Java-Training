<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<%@page import="java.time.Instant"%>

<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Welcome</h1>

	<P>The time on the server is ${Instant.now()}</P>

	<c:choose>
		<c:when test="${empty emails }">
			<h3>No email at this time.</h3>
		</c:when>

		<c:otherwise>
			<form:form>
			<c:forEach var="mail" items="${emails}">
				<table>
					<tr>
						<td><input type="checkbox"  name="subject" value="${mail.subject}">
							<a href='<c:url value="/viewMail/${mail.id }">${mail.subject}</c:url>'>${mail.subject}</a>
						 </td>
						<td><a href='<c:url value="/viewMail/pdf/${mail.id }">${mail.subject}</c:url>'>PDF</a></td>
					</tr>
				</table>
			</c:forEach>
			</form:form>
		</c:otherwise>
	</c:choose>
</body>
</html>
