<%--
  Created by IntelliJ IDEA.
  User: 汪海洋
  Date: 2022/6/27
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>注册页</h1>
<form method="post" action="${pageContext.request.contextPath}/register">
    请输入您的账号:<input type="text" name="uname" id="uname" required><br>
    请输入您的密码:<input type="password" name="upwd" id="upwd" required>
    <input type="submit" value="注册">
    <a href="login.jsp">返回上一级</a>
</form>
</body>
</html>
