<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC From Handling</title>
</head>
<body> <h2>User Registration Result</h2>
    <table>
        <tr>
            <td>First Name</td>
            <td>${u.firstname}</td>
        </tr>
        <tr>
            <td>Last name</td>
            <td>${u.lastname}</td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>${u.gender}</td>
        </tr>
        <tr>
            <td>Member Status</td>
            <td>${u.memberStatus}</td>
        </tr>
        </table>
<a href = "userForm.mvc">Add User</a>
<a href = "viewAllUsers.mvc">Add Book</a>
<a href = "viewAllUsers.mvc">View all Users</a>
<a href = "viewAllUsers.mvc">View all Books</a>
</body>
</html>