<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${students}" var="student"> 
  <tr>
    <td>${student.sid}</td>
    <td>${student.name}</td>
    <td>${student.subject}</td>
  </tr>
</c:forEach>
</body>
</html>