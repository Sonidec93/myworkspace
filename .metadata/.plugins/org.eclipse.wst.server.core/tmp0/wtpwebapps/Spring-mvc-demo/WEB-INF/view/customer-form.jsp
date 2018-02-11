<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Customer-form</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>

	<form:form action="processForm" modelAttribute="customer" method="get">
	FirstName:<form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" />
		<br>
		<br>
LastName:<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
		FreePasses:<form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		<br>
		<br>
		 PassCode:<form:input path="passCode" />
		<form:errors path="passCode" cssClass="error" />
		<br>
		<br>
		CourseCode:<form:input path="courseCode" />
		<form:errors cssClass="error" path="courseCode" />
		<br>
		<br>
		<input type="submit" value="submit" />

	</form:form>

</body>
</html>