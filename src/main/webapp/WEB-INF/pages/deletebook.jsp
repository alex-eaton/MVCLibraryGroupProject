<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Book Deletion Form</h2>
	<mvc:form modelAttribute="book" action="deletebook.mvc">
		<table>
			<tr>
				<td><mvc:label path="bookTitle">Book Title</mvc:label></td>
				<td><mvc:input path="bookTitle" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</mvc:form>

	<a href="userForm.mvc">Add User |</a>
	<a href="viewAllUsers.mvc">View all Users |</a>
	<a href="viewAllBooks.mvc">View all Books</a>
	<br><a href = "homePage.mvc">Home</a>


</body>
</html>