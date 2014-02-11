<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Project index</title>
</head>
<body>
	<table>
		<tr>
			<td>id</td>
			<td>projectname</td>
			<td>creator</td>
			<td><a href="${contextPath}/project/new">创建</a></td>
		</tr>
		<c:forEach items="${projects}" var="project" varStatus="i">
			<tr>
				<td>${i.index}</td>
				<td><a href="${contextPath}/project/show/${project.id}">${project.projectName }</a></td>
				<td>${project.user.realName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>