<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
	</head>
	<body>
		<h3 style="color:red;"><c:out value="${error}"></c:out></h3>
		<h2>What is the code?</h2>
		<form action="/code" method="post">
			<input type="text" name="code">
			<input type="submit" value="Try code">
		</form>
	</body>
</html>