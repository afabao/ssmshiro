<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>订餐系统-用户列表</title>
    <link href="${ctx}/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="panel panel-default">
    <div class="panel-heading">用户列表</div>
    <div class="panel-body">
        <shiro:hasPermission name="user:add">
            <!--新增链接-->
            <a class="btn btn-primary" href="${ctx}/user/add">新增</a>
        </shiro:hasPermission>


        <!--列表模板-->
        <table class="table table-bordered" style="margin-top: 5px;">
            <thead>
            <tr>
                <th>用户名</th>
                <th>电话</th>
                <th>邮箱</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="user">
                <tr>
                    <td>${user.username }</td>
                    <td>${user.phone }</td>
                    <td>${user.email }</td>
                    <td>
                        <shiro:hasPermission name="user:update">
                            <a href="${ctx}/user/update?id=${user.id}">修改</a> |

                        </shiro:hasPermission>

                        <shiro:hasPermission name="user:delete">
                            <a href="${ctx}/user/delete?id=${user.userId}">删除</a>
                        </shiro:hasPermission>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>