<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1 style="color: blue;">Display All Student Details</h1>
<table border="1">
<tr>
<th>SID</th>
<th>NAME</th>
<th>HIBERNATE</th>
<th>SPRING</th>
<th>SPRING BOOT</th>
<th>TOTAL</th>
<th>PERCENTAGE</th>
<th>GRADE</th>
<th>RESULT</th>
<th>DELETE</th>
<th>EDIT</th>
</tr>
<c:forEach var="Student" items="${students}">
<tr>
<td>${student.sid}</td>
<td>${student.name}</td>
<td>${student.sub1}</td>
<td>${student.sub2}</td>
<td>${student.sub3}</td>
<td>${student.total}</td>
<td>${student.percentage}</td>
<td>${student.grade}</td>
<td>${student.result}</td>
<td><a href="/delete/${student.sid}">Delete</a></td>
<td><a href="/update/${student.sid}">Edit</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>