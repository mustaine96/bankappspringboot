<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>


<body bgcolor="cyan">
<h1>Login</h1><hr>
<form:form action="/employeeapp/updateEmployee" method="post" modelAttribute="customer">
<form:label path="customerId">Employee Id</form:label>
<form:input path="customerId" readonly="readonly"/><br>



<form:label path="password">Employee Salary</form:label>
<form:input path="password"/><br>

<input type="submit" value="login"/>
</form:form>

</body>
</html>