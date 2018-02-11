<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Add a customer</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer.css" />
</head>
<body>

	<div class="wrapper">
		<div class="header">CRM-Customer Relationship Manager</div>
	</div>
	<p>
		<a href="${pageContext.request.contextPath}/customer/list">Back to
			list</a>
	</p>

	<form:form action="saveCustomer" modelAttribute="customer"
		method="POST">
		<form:hidden path="id" />
		<table>
			<tbody>
				<tr>
					<td><label>First name:</label></td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td><label>Last name:</label></td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td><label>Email:</label></td>
					<td><form:input path="email" /></td>
				</tr>
			</tbody>
		</table>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>