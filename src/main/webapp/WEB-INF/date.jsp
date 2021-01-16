<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Date displayS</title>
		<link rel="stylesheet" type="text/css" href="css/date.css">
		<script type="text/javascript" src="js/app.js"></script>
	</head>
	<body>
		<h2><c:out value= "${date}"/></h2>
	</body>
</html>