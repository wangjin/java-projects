<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BusinessLedger show</title>
<style type="text/css">
td {
	text-align: center;
}
</style>
</head>
<body>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
 <div class="jumbotron">
      <div class="container">
		<table class="table">
				<tr>
					<td>${businessLedger.businessId}</td>
					<td colspan="2">${businessLedger.businessName}</td>
					<td>${businessLedger.user.realName}</td>
					<td><a href="${contextPatd}/businessledger/new" class="btn btn-primary">添加新业务</a></td>
				</tr>
				<tr>
					<td>${i.index}</td>
					<td>${businessLedger.businessId}</td>
					<td>${businessLedger.businessName}</td>
					<td>$(businessLedger.user.realName)</td>
					<td>@mdo</td>
				</tr>
		</table>
	</div>
    </div>
</body>
</html>