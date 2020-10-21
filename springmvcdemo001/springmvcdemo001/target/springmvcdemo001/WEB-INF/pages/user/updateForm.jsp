
<%--
  Created by IntelliJ IDEA.
  User: neustu
  Date: 2020/10/20
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
    <form method="post" action="${app}/user/updateUser">
        <input type="text" readonly="readonly"  name="uid" value="${user.uid}" placeholder="uid" />
        <input type="text" name="username" value="${user.username}" placeholder="username" />
        <input type="text" name="password" value="${user.password}" placeholder="pass" />
        <input type="submit" value="修改信息" />
    </form>
</body>
</html>
