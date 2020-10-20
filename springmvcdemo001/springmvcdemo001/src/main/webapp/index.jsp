<%--
  Created by IntelliJ IDEA.
  User: neustu
  Date: 2020/10/14
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--引入jstl的标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--引入jstl的格式化标签库--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--引入spring的表单标签库--%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%
    String appPath = request.getContextPath();
    request.getSession().setAttribute("app",appPath);
%>
<html>
<head>
    <title>站点首页</title>
    <link rel="stylesheet" href="${app}/static/css/bootstrap.css" />
</head>
<body>
<a href="${app}/user/login">去登录</a>  当前登录用户:${USER_SESSION}   <a href="${app}/user/logout">退出登录</a>

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
    <sf:form method="get" action="${app}/stockPool/add" modelAttribute="stockPool">
        <input type="text" name="sid" value="${stockPool.sid}" />
        <input type="text" name="sname"  value="${stockPool.sname}" /><sf:errors path="sname"></sf:errors>
        <input type="text" name="shold" value="${stockPool.shold}" /><sf:errors path="shold"></sf:errors>
        <input type="text" name="sprice" value="${stockPool.sprice}" />
        <input type="date" name="sintime" value="<fmt:formatDate value="${stockPool.sintime}" pattern="yyyy-MM-dd"></fmt:formatDate>" />
        <input type="text" name="shaccount.aid" value="${stockPool.shaccount.aid}" />
        <input type="submit" value="添加新账号" />
    </sf:form>
    <c:if test="${allErrors != null}">
        <c:forEach items="${allErrors}"  var="tempError">
            ${tempError.defaultMessage} <br />
        </c:forEach>
    </c:if>
    <hr />

<hr />
<form method="post" action="${app}/user/up" enctype="multipart/form-data">
    <input type="text" name="username" />
    <input type="file" name="item" />
    <input type="submit" value="执行操作" />
</form>
<hr />
<a href="${app}/shaccount/addShaccount?aname=abcdefg">添加一个新账号</a>

<hr />
<input id="username" type="text" name="username" />


<button id="getJson">获取json数据</button>
<select id="ch">
</select>


<hr />
<form action="${app}/user/opt" method="post">
    <input type="submit" value="post请求" />
</form>
<form action="${app}/user/opt/1" method="get">
    <input type="submit" value="get请求" />
</form>
    <script src="${app}/static/js/jquery-3.3.1.js"></script>
    <script src="${app}/static/js/bootstrap.js"></script>
<script>
    $(document).ready(function (){
            $("#getJson").click(function (){
                $.get(
                    "${app}/user/list",
                    function (data){
                        alert(data.message);
                        for(var i=0;i<data.dataZone.users.length;i++){
                            $("#ch").append("<option>"+ data.dataZone.users[i].username +"</option>")
                        }
                    }
                );
            });

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
