<%@ page language="java"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="margin: 0 auto; display:table;">
	<form action="/ConnectDB/addServlet" method="get" style="margin: 0 auto">
		<table border="1">
			<caption>添加用户</caption>
			<tr>
				<th>用户名：</th>
				<td><input name="name"></td>
			</tr>
			<tr>
				<th>密码：</th>
				<td><input name="pass"></td>
			</tr>
			<tr>
				<th>电话：</th>
				<td><input name="phone"></td>
			</tr>
			<tr>
				<th>邮箱：</th>
				<td><input name="email"></td>
			</tr>
			<tr style="text-align: center">
				<td colspan="2"><input type="submit"></td>
			</tr>
		</table>
		
	</form>
	</div>
</body>
</html>