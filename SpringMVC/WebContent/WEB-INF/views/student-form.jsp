<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<!-- <form action="processForm" method="post">
Enter Student Name: <input type="text" name="txtName">
<br>
<input type="submit" value="Go">
</form> -->

<form:form action="processForm" modelAttribute="student">
Enter FirstName: <form:input path="firstName"/>
<br><br>
Enter LastName: <form:input path="lastName"/>
<br><br>
Select Country:
<form:select path="country">
<form:options items="${student.countryOptions}"/>
</form:select>
<br><br>
Enter language:
Java<form:radiobutton path="language" value="Java"/>
Python<form:radiobutton path="language" value="Python"/>
Cloud Computing<form:radiobutton path="language" value="Cloud Computing"/>
<br><br>
Select Operating-Systems:
Mac<form:checkbox path="operatingSystems" value="Mac"/>
Windows<form:checkbox path="operatingSystems" value="Windows"/>
Linux<form:checkbox path="operatingSystems" value="Linux"/>
<br><br>
<%-- <form:button type="submit" value="Submit" ></form:button> --%>
<input type="submit" value="Submit">
</form:form>
</body>
</html>