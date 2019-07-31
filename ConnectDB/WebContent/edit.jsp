<%@ page language="java" import="com.entity.User" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="margin: 0 auto; display:table;">
	<form action="/ConnectDB/editServlet" method="get" style="margin: 0 auto">
		<%User user=(User)request.getAttribute("user"); %>
			<input name="id" value="<%=user.getId()%>" style="display: None">
		<table border="1">
			<caption>修改信息</caption>
			
			<tr>
				<th>用户名：</th>
					<td><input name="name" value="<%=user.getName()%>"></td>
			</tr>
			<tr>
				<th>密码：</th>
				<td><input name="pass" value="<%=user.getPassword()%>"></td>
			</tr>
			<tr>
				<th>电话：</th>
				<td><input name="phone" value="<%=user.getPhone()%>"></td>
			</tr>
			<tr>
				<th>邮箱：</th>
				<td><input name="email" value="<%=user.getEmail()%>"></td>
			</tr>
			<tr style="text-align: center">
				<td colspan="2"><input type="submit"></td>
			</tr>
		</table>
		
	</form>
</div>
</body>
</html>