<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
	<title>Main</title>
</head>
<body>
	<form:form method="POST" modelAttribute="user">
		<fieldSet>
			<form:label path="username">Username</form:label>
			<form:input path="username"/>
			<form:errors path="username"/>

			<form:label path="password">Password</form:label>
			<form:password path="password"/>
			<form:errors path="password"/>
		</fieldSet>

		<input type="submit" name="_eventId_submit">
	</form:form>
</body>

</html>