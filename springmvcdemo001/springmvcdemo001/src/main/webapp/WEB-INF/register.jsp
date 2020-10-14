<%--
  Created by IntelliJ IDEA.
  User: neustu
  Date: 2020/10/14
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
    <form method="get" action="/user/doRegister">
        <input type="text" name="uname" />
        <input type="password" name="upass" />
        <input type="submit" value="注册新用户" />
    </form>
</body>
</html>
