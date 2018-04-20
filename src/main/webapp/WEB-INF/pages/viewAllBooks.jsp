<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Users</title>
</head>
<body>
	<c:forEach items="${all}" var="item">
		<table>
			<tr>
				<td>Title</td>
				<td>${item.bookTitle}</td>
			</tr>
			<tr>
				<td>Author</td>
				<td>${item.author}</td>
			</tr>
			<tr>
				<td>Description</td>
				<td>${item.bookDesc}</td>
			</tr>
			<tr>
				<td>Genre</td>
				<td>${item.genre}</td>
			</tr>
			<tr>
				<td>Book Status</td>
				<td>${item.bookStatus}</td>
			</tr>

		</table>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
	</c:forEach>
	<a href = "homePage.mvc">View HomePage</a>

</body>
</html>