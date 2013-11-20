<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${contextPath}/resources/css/bootstrap.css">
<script type="text/javascript"
	src="${contextPath}/resources/js/jquery.js"></script>
<script type="text/javascript"
	src="${contextPath}/resources/js/bootstrap.js"></script>
<title>BusinessLedger new</title>
<style type="text/css">
td {
	text-align: center;
}
</style>
</head>
<body>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
      <div class="container">
		<table align="center">
		<tr>
		<td><input type="text" class="form-control" placeholder="业务编号"></td>
		</tr>
		</table>
	</div>
</body>
</html>