<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/29
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My JSP  starting page</title>
</head>
<body>
<form action="registerServlet"method="post" style="padding-top:-700px;">
    输入姓名:<input name="name" type="text"><br><br>
    输入密码:<input name="password" type="password"><br><br>
    输入id:<input name="id" type="text" ><br><br>

    <input type="reset"value="重置"><input type="submit"value="注册">
</form>
</body>
</html>
