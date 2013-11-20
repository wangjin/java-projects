<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${contextPath}/resources/css/bootstrap.css">
<script type="text/javascript"
	src="${contextPath}/resources/js/jquery.js"></script>
<script type="text/javascript"
	src="${contextPath}/resources/js/bootstrap.js"></script>
<title>BusinessLedger index</title>
<style type="text/css">
th {
	text-align: center;
}

td {
	text-align: center;
}
</style>
</head>
<body>

<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
    
    <div class="jumbotron">
      <div class="container">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>业务编号</th>
					<th>业务名称</th>
					<th>责任人</th>
					<th><a href="${contextPath}/businessledger/new" class="btn btn-primary">添加新业务</a></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${businessLedgers}" var="businessLedger" varStatus="i">
				<tr>
					<td>${i.index}</td>
					<td>${businessLedger.businessId}</td>
					<td>${businessLedger.businessName}</td>
					<td>$(businessLedger.user.realName)</td>
					<td>@mdo</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
    </div>
	
</body>
</html>