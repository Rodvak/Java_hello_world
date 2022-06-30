<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Edit Book</title>
</head>
<body>
	<div class="container bg-light bg-gradient mt-5 p-4 border border-5 border-secondary text-secondary font-monospace text-secondary">
	<h1>Edit book ${book.user.getUserName()}</h1>
<form:form action="/books/${book.id}" method="put" modelAttribute="book">
<form:input type="hidden" path="user" value="${user_id}"/>
    <div class="mb-3">
        <form:label class="form-label" path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input class="form-control" path="title"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="author">Author</form:label>
        <form:errors path="author"/>
        <form:input class="form-control" path="author"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="thoughts">My Thoughts</form:label>
        <form:errors path="thoughts"/>     
        <form:input class="form-control" path="thoughts"/>
    </div>    
    <input type="submit" value="Update" class="btn btn-outline-secondary"/>
</form:form>    
  <br />
<a class="btn btn-outline-secondary" href="/home"> Home</a>
	</div>
</body>
</html>