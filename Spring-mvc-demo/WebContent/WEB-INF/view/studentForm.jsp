<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student form</title>
</head>
<body>

	<form:form action="processStudentForm" modelAttribute="student"
		method="get">
First Name: <form:input path="firstName" />
		<br>
		<br>
Last Name: <form:input path="lastName" />
		<br>
		<br>
Country: <form:select path="country">
			<form:options items="${student.countryList}" />
		</form:select>
		<br>
		<br>
		Java<form:radiobutton path="language" value="Java" />
		PHP<form:radiobutton path="language" value="PHP" />
		<br>
		<br>
		Operating systems: Windows <form:checkbox path="operatingSystems" value="Windows"/> Linux <form:checkbox path="operatingSystems" value="Linux"/>
		<input type="submit" value="submit">
	</form:form>

</body>
</html>