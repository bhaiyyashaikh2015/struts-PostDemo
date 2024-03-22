<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="login" method="post">
		<s:textfield label="Enter Username" name="username"></s:textfield>
		<s:password label="Enter Password" name="password"></s:password>
		<s:submit value="Submit"></s:submit>
	</s:form>

</body>
</html>