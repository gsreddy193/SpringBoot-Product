<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body bgcolor="pink">
<h1>Edit User Data</h1>
<form:form method="Post" action="/editu">
<table>
<tr>
<td></td>
<td><form:hidden path="sid"/></td>
</tr>
<tr>
<td>Name :</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>Hibernate :</td>
<td><form:input path="sub1"/></td>
</tr>
<tr>
<td>Spring :</td>
<td><form:input path="sub2"/></td>
</tr>
<tr>
<td>Spring Boot :</td>
<td><form:input path="sub3"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="EditSave"></td>
</tr>
</table>
</form:form>
<a href="viewstudent">View All Student Details</a>
<a href="viewstudent">Back</a>
</body>