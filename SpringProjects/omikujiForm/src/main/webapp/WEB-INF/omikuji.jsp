<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>
</head>
<body>
    <h3>Send on Omikuji</h3>
    <form action="/omikuji/show" method="post">
    	<label>Pick any number from 1 to 5</label>
    	<select name="number" id="">
    	<option value="">1</option>
    	<option value="">2</option>
    	<option value="">3</option>
    	<option value="">4</option>
    	<option value="">5</option>
    	</select>
        <label>Enter the name of any city:</label>
        <input type="text" name="city">
        <label>Enter the name of any person:</label>
        <input type="text" name="person">
        <label>Enter a hobby:</label>
        <input type="text" name="hobby">
        <label>Enter any type of living thing:</label>
        <input type="text" name="thing">
        <label>Say something nice to someone:</label>
        <textarea name="somethingnice" cols="30" rows="10"></textarea>
        <label> Send and show a friend</label>
        <input type="submit">
    </form>
 
</body>
</html>