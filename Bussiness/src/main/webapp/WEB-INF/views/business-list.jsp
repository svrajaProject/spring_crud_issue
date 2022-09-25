<%@page  import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<div class="container p-3 my-3 bg-primary text-white">
		<h1>Bussiness Form - 22</h1>
		<hr>
		<h3>
			GL Fest - 2022
			<hr>
			<p>
				<a href="./list" class="btn btn-info" role="button">Participants
					- GL - FEST</a>
				<a href="home/list" class="btn btn-info" role="button">Participants
					- GL - FEST - Add</a>
			</p>
			<hr>
			</h3>
			</div>
			<div class="container">
				<c:forEach var ="b" items="${bussinesse}" varStatus="c">
					<p>${b.fname}</p>					
				</c:forEach>
			</div>
	</body>
</html>











