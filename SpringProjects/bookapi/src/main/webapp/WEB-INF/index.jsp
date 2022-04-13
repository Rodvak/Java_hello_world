<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Rendering Books</title>
</head>
<body>
	<div class="container bg-dark bg-gradient mt-5 p-4 border border-5 text-white ">
		<h1>Book Title: ${book.title}</h1>
		<h1>Description: ${book.description}</h1>
		<h1>Language: ${book.language}</h1>
		<h1>Pages: ${book.numberOfPages}</h1>
		<br />
		<a href="/allbooks" class="btn btn-outline-light" >Go Back</a>
	</div>
</body>
</html>