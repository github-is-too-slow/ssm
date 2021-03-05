<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
	<%
		String basePath = request.getScheme() + "://" +
				request.getServerName() + ":" +
				request.getServerPort() +
				request.getContextPath() + "/";
	%>
	<title>显示学生信息</title>
	<base href="<%=basePath%>">
	<script src="js/jquery-3.5.1.js"></script>
	<script>
		$(function () {
		    loadStudents();
			$("#update").click(function () {
			    loadStudents();
            });
        });

		function loadStudents() {
            $.ajax({
                url: "student/listStudent.do",
                type: "get",
                dataType: "json",
                success: function (stus) {
                    $("#tb").html("");
                    $.each(stus, function (index, elem) {
                        $("#tb").append("<tr>")
                            .append("<td>" + elem.id + "</td>")
                            .append("<td>" + elem.name + "</td>")
                            .append("<td>" + elem.email + "</td>")
                            .append("<td>" + elem.age + "</td>")
                            .append("</tr>");
                    });
                }
            });
        }
	</script>
</head>
<body>
	<div align="center">
		<table>
			<thead>
				<tr>
					<td>学号</td>
					<td>姓名</td>
					<td>邮箱</td>
					<td>年龄</td>
				</tr>
			</thead>
			<tbody id="tb">

			</tbody>
		</table>
		<button id="update">刷新数据</button>
	</div>
</body>
</html>
