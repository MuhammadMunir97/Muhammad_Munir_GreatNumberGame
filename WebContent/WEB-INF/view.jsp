<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
*{
text-align: center;
}
.high{
	height : 200px;
	width : 30%;
	display: block;
	margin: auto;
	font-size: 50px;
	background-color: blue;

}

.low{
	height : 200px;
	width : 30%;
	display: block;
	margin: auto;
	font-size: 50px;
	background-color: red;
}

</style>
<meta charset="UTF-8">
<title>Great Number Game</title>
</head>
<body>
	<h1>Welcome to the Great Number Game!</h1>
	<h3>I am thinking of a number between 1 and 100 </h3><br>
	<h3>take a guess</h3>
	<div class = "${number}" > This number is too <c:out value="${number}"/> </div>
	<form action= "controllingTheGame" method="POST">
		<input type="text" name="number"/><br>	
		<input type="submit" value="submit" />
	</form>	
	<h1> Number of Tries: <c:out value="${NumOfTries}"/></h1>
</body>
</html>