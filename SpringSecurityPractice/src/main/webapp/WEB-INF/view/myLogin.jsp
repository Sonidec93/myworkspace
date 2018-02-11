<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
	color: red;
}

.success {
	color: green;
}
</style>
<title>LOGIN</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/authenticate"
		method="POST">
		<c:if test="${param.error!=null}">
			<i class="error">Invalid username or password</i>
		</c:if>
		<c:if test="${param.logout!=null}">
			<i class="success">Successfully logged out</i>
		</c:if>
		<p>
			User:<input type="text" name="username" />
		</p>
		<p>
			Password:<input type="password" name="password" />
		</p>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}"> <input type="submit" value="submit">

	</form>
</body>
</html>