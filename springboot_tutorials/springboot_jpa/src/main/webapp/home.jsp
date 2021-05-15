<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Form to add student into database:</h3>
	<form action="addStudent">
		Id: <input type="text" name="sid"><br> 
		name: <input type="text" name="name"><br>
		Subject: <input type="text" name="subject"><br><br>
		<input type="submit" value="Submit">
	</form>
	<hr>
	<h3>Form to get a student from database:</h3>
	<form action="getStudent">
		Id: <input type="text" name="sid"><br><br>
		<input type="submit" value="Submit">
	</form>
	<hr>
	<h3>Get list of students by passing subject name</h3>
	<form action="customQuery1">
		Id: <input type="text" name="subject"><br><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>