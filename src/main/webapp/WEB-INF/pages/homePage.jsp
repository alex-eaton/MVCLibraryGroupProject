<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
</head>
<body>
<h2>Amazing Library Site Home Page</h2>
<mvc:form modelAttribute="user" action="result.mvc"> 
</mvc:form>
	<a href="userForm.mvc">Add User</a>
	<a href="bookForm.mvc">Add Book</a>
	<a href="viewAllUsers.mvc">View all Users</a>
	<a href="viewAllBooks.mvc">View all Books</a>

</body>
</html>