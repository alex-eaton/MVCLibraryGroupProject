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
<h2>User Registration Form</h2>
<mvc:form modelAttribute="user" action="result.mvc">
	<table>
	    <tr>
	        <td><mvc:label path="firstname">First Name</mvc:label></td>
	        <td><mvc:input path="firstname" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="lastname">Last Name</mvc:label></td>
	        <td><mvc:input path="lastname" /></td>
	    </tr>
        <tr>
	        <td><mvc:label path="gender">Gender</mvc:label></td>
	        <td><mvc:radiobuttons path="gender" />
	        	</td>
	    </tr>
			<tr>
				<td><mvc:label path="memberStatus">Member Status</mvc:label></td>
				<td><mvc:select path="memberStatus" items="${statuses}" /></td>
			</tr>
			<tr>
	        <td colspan="2">
                <input type="submit" value="Submit" />
	        </td>
	    </tr>
	</table>  
</mvc:form>
<a href = "userForm.mvc">Add User</a>
<a href = "bookForm.mvc">Add Book</a>
<a href = "viewAllUsers.mvc">View all Users</a>
<a href = "viewAllUsers.mvc">View all Books</a>
</body>
</html>