
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
<a href="${app}/user/addForm">添加新用户</a>
    <table>
        <thead>
        <tr>
            <th>全选</th>
            <th>序号</th>
            <th>uid</th>
            <th>username</th>
            <th>password</th>
            <th>修改</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
<%--        循环输出--%>
        <c:forEach items="${users}" var="user" varStatus="status">
            <tr>
                <td><input type="checkbox" name="choicelist" /></td>
                <td>${status.index}</td>
                <td>${user.uid}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td><a href="${app}/user/updateForm?uid=${user.uid}">修改</a></td>
                <td><a href="${app}/user/delete?uid=${user.uid}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
