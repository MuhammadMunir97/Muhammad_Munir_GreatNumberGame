<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PlayAgain</title>
</head>
<body>
	<h1><c:out value="${randNumber}"/> was the number</h1>
	<form action= "numberGame" method="POST">
		<input type="submit" value="Play Again" />
	</form>	
	<h1>You got it right in <c:out value="${NumOfTries}"/> tries</h1>
</body>
</html>