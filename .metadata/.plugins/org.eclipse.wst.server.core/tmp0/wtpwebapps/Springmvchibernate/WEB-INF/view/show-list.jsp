<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<title>List of Customers</title>

</head>
<body>
	<div class="wrapper">
		<div class="header">CRM-Customer Relationship Manager</div>
	</div>
	<input type="button" value="Add customer"
		onclick="window.location.href='addCustomer';return false;">
	<div class="container">
		<div class="content">
			<table>
				<tr>
					<th>FirstName</th>
					<th>LastName</th>
					<th>Email</th>
				</tr>
				<c:forEach var="temp" items="${customers}">
					<tr>
						<td>${temp.firstName}</td>
						<td>${temp.lastName}</td>
						<td>${temp.email}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>