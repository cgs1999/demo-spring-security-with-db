<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>首页</h3>
	<a href="${pageContext.request.contextPath}/common">普通页面</a><br>
	<a href="${pageContext.request.contextPath}/admin">管理页面</a><br>
	<a href="${pageContext.request.contextPath}/j_spring_security_logout">注销</a>
	
</body>
</html>