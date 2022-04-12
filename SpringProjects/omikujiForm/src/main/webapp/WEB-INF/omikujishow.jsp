<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"/>
<meta charset="UTF-8">
<title>Omikuji</title>
</head>
<body>
<div class="container col-sm-3 bg-primary mt-5 p-4 border border-dark">
	<h1>Here is Your Omikuji</h1>
	<br />
	<h2>In ${number} years, you will live in ${city} with ${person} as
		your roommate. ${hobby} for a living. The next time you see a
		${thing}, you will have good luck. Also ${somethingnice}.</h2>
	<a class="btn btn-warning" href="/omikuji">Go Back</a>
</div>
</body>
</html>