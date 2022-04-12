<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- CSS only -->
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Omikuji</title>
</head>
<body>

<div class="container col-sm-4 bg-warning mt-5 p-3 border border-dark">
    <h3>Send on Omikuji</h3>
 <form action="/omikuji/form" method="post">
   <div class="mb-3">
    <label class="form-label">Enter a number from 1 to 10:</label>
    <input type="number" min=1 max=10 class="form-control"  name="number">
  </div>
  <div class="mb-3">
    <label class="form-label">Enter the name of any city:</label>
    <input class="form-control"  name="city">
  </div>
   <div class="mb-3">
    <label class="form-label">Enter the name of any person:</label>
    <input class="form-control"  name="person">
  </div>
   <div class="mb-3">
    <label class="form-label">Enter a hobby:</label>
    <input class="form-control"  name="hobby">
  </div>
   <div class="mb-3">
    <label class="form-label">Enter any type of living thing:</label>
    <input class="form-control" name="thing">
  </div>
   <div class="mb-3">
    <label class="form-label">Say something nice to someone:</label>
    <input class="form-control" name="somethingnice">
  </div>
  <input type="submit" class="btn btn-primary">
</form>
</div>
</body>
</html>