<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC From Handling</title>
</head>
<body>
	<h2>Book Registration Result</h2>
	<table>
		<tr>
			<td>Title</td>
			<td>${u.bookTitle}</td>
		</tr>
		<tr>
			<td>Author</td>
			<td>${u.author}</td>
		</tr>
		<tr>
			<td>Description</td>
			<td>${u.bookDesc}</td>
		</tr>
		<tr>
			<td>Genre</td>
			<td>${u.genre}</td>
		</tr>
		<tr>
			<td>Status</td>
			<td>${u.bookStatus}</td>
		</tr>
	</table>
	<a href="userForm.mvc">Add User |</a>
	<a href="bookForm.mvc">Add Book |</a>
	<a href="viewAllUsers.mvc">View all Users |</a>
	<a href="viewAllBooks.mvc">View all Books |</a>
	<br><a href = "homePage.mvc">Home</a>


</body>
</html>