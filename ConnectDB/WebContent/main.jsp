<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page import="java.util.*" import="com.entity.User" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主页</title>
</head>
<body>
<div style="margin: 0 auto; display:table;">
	<table border="1">
				<caption>查询用户</caption>
				<tr>
					<th>用户名</th>
					<th>密码</th>
					<th>电话</th>
					<th>邮箱</th>
					<th colspan="2">操作</th>
				</tr>
				<%
				List<User> users=(List<User>)request.getAttribute("users");
				for(User user:users){
					out.write("<tr><td>"+user.getName()+"</td><td>"
				+user.getPassword()+"</td><td>"+user.getPhone()+
				"</td><td>"+user.getEmail()+"</td><td><a href=\"/ConnectDB/deleteServlet?id="+user.getId()+"\">删除</a></td>"+
				"<td><a href=\"/ConnectDB/editPage?id="+user.getId()+"\">修改</a></td></tr>");
				}
				%>
				<tr style="text-align: center">
				<td colspan="6"><a href="add.jsp">添加用户</a></td>
			</tr>
	</table>
	<br>
	
</div>
</body>
</html>