<%--
  Created by IntelliJ IDEA.
  User: 汪海洋
  Date: 2022/6/27
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
<h1>SSM项目测试</h1>
${userInfo}
<form action="${pageContext.request.contextPath}/login" method="post">
    账户名<input type="text" name="uname" id="uname"><br>
    密码<input type="password" name="upwd" id="upwd">
    <input type="submit" value="提交">
</form>
<a href="register.jsp">注册</a>
</body>
</html>
