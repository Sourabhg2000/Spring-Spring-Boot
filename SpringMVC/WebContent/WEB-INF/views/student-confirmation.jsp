<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Student Confirmed: ${student.firstName} ${student.lastName}
<br><br>
Student Country: ${student.country}
<br><br>
Student Language: ${student.language}
<br><br>
Operating Systems:
<ul>
<c:forEach var="temp" items="${student.operatingSystems}">
${temp}
</c:forEach>
</ul>
</body>
</html>