<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Homepage</title>
</head>
<body>
	<h1>
		Welcome
		<security:authentication property="principal.username" />
	</h1>
	<hr>
	<hr>
	Your roles are :
	<security:authentication property="principal.authorities" />
	<a href="${pageContext.request.contextPath}/leaders">For managers
		only</a>
	<hr>
	<form:form action="${pageContext.request.contextPath}/logout">
		<!-- input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"> -->
		<input type="submit" value="logout">

	</form:form>
</body>
</html>