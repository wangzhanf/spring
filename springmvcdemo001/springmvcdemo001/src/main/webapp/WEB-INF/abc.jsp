<%--
  Created by IntelliJ IDEA.
  User: neustu
  Date: 2020/10/14
  Time: 15:56
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
    <title>Title</title>
    <link rel="stylesheet" href="${app}/static/css/bootstrap.css" />
</head>
<body>
    这是第一个视图页
<a href="${app}/user/list">用户管理</a>
<button id="usersBtn">RESTful风格用户管理</button>

    <table id="dataTable">
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

        </tbody>
    </table>


    <script src="${app}/static/js/jquery-3.3.1.js"></script>
    <script src="${app}/static/js/bootstrap.js"></script>

<script>
    $(document).ready(function (){
        $("#usersBtn").click(function (){
            $('#dataTable>tbody').empty();
            $.get(
                "${app}/userrest/opt",
                function (res){
                    alert(res.message);
                    for(var i=0;i<res.dataZone.users.length;i++){
                        $('#dataTable>tbody').append('<tr>'+
                            '<td><input type="checkbox" name="choicelist" /></td>' +
                            '<td>'+i+'</td>' +
                            '<td>'+res.dataZone.users[i].uid+'</td>' +
                            '<td>'+res.dataZone.users[i].username+'</td>' +
                            '<td>'+res.dataZone.users[i].password+'</td>' +
                            '<td><a href="${app}/userrest/opt?uid='+res.dataZone.users[i].uid+'">修改</a></td>' +
                            '<td><input type="button" class="deleteBtn" value="'+res.dataZone.users[i].uid+'" /></td>' +
                            +'</tr>');
                    }
                }
            );
        });

        $("#dataTable").on("click",".deleteBtn",
            function (ele){
                $.ajax({
                    url: "${app}/userrest/opt/"+ele.target.value,
                    type : "DELETE",
                    success:function(res){
                        alert(res.message);
                    }
                });
            }
        );

    });
</script>

</body>
</html>
