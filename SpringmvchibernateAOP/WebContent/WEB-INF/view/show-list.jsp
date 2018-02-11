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
					<th>Action</th>
				</tr>
				<c:forEach var="temp" items="${customers}">
					<c:url var="deleteLink" value="/customer/deleteCustomer">
						<c:param name="customerId" value="${temp.id}" />
					</c:url>
					<tr>
						<td>${temp.firstName}</td>
						<td>${temp.lastName}</td>
						<td>${temp.email}</td>
						<td><a
							href="${pageContext.request.contextPath}/customer/updateCustomer?customerId=${temp.id}">Update</a>|
							<a href="${deleteLink}"
							onclick="if(!confirm('do you want to delete this customer?')) return false;">Delete</a>

							<!-- a
							onclick="var r=confirm('Do you really want to delete'); if(r){window.location.href='${pageContext.request.contextPath}/customer/deleteCustomer?customerId=${temp.id}';}else{return false;}">Delete</a>-->
						</td>
					</tr>

				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>