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
<title>Ninja Gold</title>
</head>
<body>
	<div class="container bg-light bg-gradient p-0">
		<div class="bg-warning bg-gradient">
			<h1>Your Gold: ${gold}</h1>
		</div>
		<div class="row row-cols-4 mt-5 p-3">
			<div class="col border border-dark bg-danger bg-gradient w-50 p-3">
				<h2>Farm</h2>
				<h4>(earns 10-20 gold)</h4>
				<form action="/gold" method="post">
					<input type="submit" value="Find Gold"
						class="btn btn-outline-light" name="farm" />
				</form>
			</div>
			<div class="col border border-dark bg-success bg-gradient w-50 p-3">
				<h2>Cave</h2>
				<h4>(earns 10-20 gold)</h4>
				<form action="/gold" method="post">
					<input type="submit" value="Find Gold"
						class="btn btn-outline-light" name="cave" />
				</form>
			</div>
			<div class="col border border-dark bg-secondary bg-gradient w-50 p-3">
				<h2>House</h2>
				<h4>(earns 10-20 gold)</h4>
				<form action="/gold" method="post">
					<input type="submit" value="Find Gold"
						class="btn btn-outline-light" name="house" />
				</form>
			</div>
			<div class="col border border-dark bg-info bg-gradient w-50 p-3">
				<h2>Quest</h2>
				<h4>(earns/takes 0-50 gold)</h4>
				<form action="/gold" method="post">
					<input type="submit" value="Find Gold"
						class="btn btn-outline-light" name="quest" />
				</form>
			</div>
			<div class="mt-5">
				<h1>Activities:</h1>
				<textarea name="" id="" cols="150" rows="8"></textarea>
			</div>
		</div>
	</div>
</body>
</html>