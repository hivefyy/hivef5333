<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/29
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <title>登录注册页面</title>
</head>
<body>
<form action="loginServlet" method="post" style="padding-top: -700px;">
    用户名：<input type="text" name="name" value="001"><br><br>
    密码：<input type="password" name="password" value="123"><br><br>
    <input type="submit" value="登录" name="login"><input type="reset" value="重置"><br>
</form>

<form action="register.jsp">
    <input type="submit" value="新用户注册">
</form>

</body>
</html>
