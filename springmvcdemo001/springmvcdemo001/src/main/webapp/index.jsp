<%--
  Created by IntelliJ IDEA.
  User: neustu
  Date: 2020/10/14
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String appPath = request.getContextPath();
    request.getSession().setAttribute("app",appPath);
%>
<html>
<head>
    <title>站点首页</title>
</head>
<body>
    <a href="${app}/user/reg">用户111111注册</a>
    <hr />传递独立参数
<form method="get" action="${app}/shaccount/add2">
    <input type="text" name="myaid" />
    <input type="text" name="myaname" />
    <input type="text" name="myainmarket" />
    <input type="submit" value="添加新账号" />
</form>
    <hr />传递对象
    <form method="get" action="${app}/shaccount/add1">
        <input type="text" name="aid" />
        <input type="text" name="aname" />
        <input type="date" value="2020-10-16" name="ainmarket" />
        <input type="submit" value="添加新账号" />
    </form>
    <hr />传递对象
    <form method="get" action="${app}/stockPool/add">
        <input type="text" name="sid" />
        <input type="text" name="sname" />
        <input type="text" name="shold" />
        <input type="text" name="sprice" />
        <input type="datetime-local" name="sintime" />
        <input type="text" name="shaccount.aid" />
        <input type="submit" value="添加新账号" />
    </form>
    <hr />
<a href="${app}/shaccount/addShaccount?aname=abcdefg">添加一个新账号</a>

<hr />
<input id="username" type="text" name="username" />
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script>
    $(document).ready(function (){
            $("#username").blur(function (){
                $.get("${app}/hello/jsonStr?un="+$("#username").val(),function (res){
                    alert(res);
                });
            });
        }
    );
</script>
</body>
</html>
