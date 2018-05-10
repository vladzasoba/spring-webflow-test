<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
	<title>Main</title>
</head>
<body>
	<h1>Welcome to the main p</h1>
	<a href="${flowExecutionUrl}&_eventId=homePage">Forward to <b>home</b> page</a>
	<br/>
	<a href="${flowExecutionUrl}&_eventId=cancelPage">Cancel</a>
</body>

</html>