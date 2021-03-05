<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<%
		String basePath = request.getScheme() + "://" +
						request.getServerName() + ":" +
						request.getServerPort() +
						request.getContextPath() + "/";
	%>
	<title>首页</title>
	<base href="<%=basePath%>">
</head>
<body>
	<div align="center">
		<p>第一个ssm项目首页</p>
		<img src="img/ssm.jpg" alt="正在加载...">
		<table>
			<tr>
				<td><a href="addStudent.jsp">学生注册</a></td>
			</tr>
			<tr>
				<td><a href="listStudent.jsp">浏览学生</a></td>
			</tr>
		</table>
	</div>
</body>
</html>
