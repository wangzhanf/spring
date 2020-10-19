<%--
  Created by IntelliJ IDEA.
  User: neustu
  Date: 2020/10/19
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--引入jstl的标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--引入jstl的格式化标签库--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--引入spring的表单标签库--%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <sf:form method="post" action="${app}/user/loginCheck" modelAttribute="user">
        <input type="text" name="username" value="${user.username}" />
        <sf:errors path="username"></sf:errors>
        <input type="password" name="password" value="${user.password}" />
        <sf:errors path="password"></sf:errors>
        <input type="submit" value="登录" />
    </sf:form>

${msg}

</body>
</html>
