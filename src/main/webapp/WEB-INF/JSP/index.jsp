<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>shiro权限系统-首页</title>
    <link href="${ctx}/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="${ctx}/plugin/layer/theme/default/layer.css"/>
    <style>
        li {
            list-style-type: none;
        }
    </style>
</head>

<body>
<!--布局-->
<div class="container-fluid" style="margin-top: 10px;">
    <!--头部区域-->
    <nav class="navbar navbar-inverse" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">权限系统</a>
            </div>

            <shiro:user>
                <div>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <span class="glyphicon glyphicon-user"></span>
                                <shiro:principal property="username"/>
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">修改密码</a>
                                </li>
                                <li class="divider"></li>
                                <li>
                                    <a href="${ctx}/logout">退出</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </shiro:user>
        </div>
    </nav>

    <div class="row">
        <!--导航区域-->
        <div class="col-md-2" style="margin-right: -25px;">
            <div class="panel panel-default">
                <div class="panel-heading">系统</div>
                <div class="panel-body" style="height: 500px;">

                    <shiro:hasPermission name="sys:use">
                        <ul style="padding-left: 5px;">
                            <li>
                                <a href="${ctx}/user/list" target="main-body">用户管理</a>
                            </li>
                        </ul>
                    </shiro:hasPermission>

                    <shiro:hasPermission name="product:manager" >

                        <ul style="padding-left: 5px;">
                            <li>
                                <a href="#">商品管理</a>
                                <ul style="padding-left: 15px;">
                                    <shiro:hasPermission name="category:list">
                                        <li>
                                            <a href="${ctx}/category" target="main-body">类目管理</a>
                                        </li>
                                    </shiro:hasPermission>
                                    <shiro:hasPermission name="product:list">
                                        <li>
                                            <a href="${ctx}/product" target="main-body">商品管理</a>
                                        </li>
                                    </shiro:hasPermission>
                                </ul>
                            </li>
                        </ul>
                    </shiro:hasPermission>
                </div>
            </div>
        </div>
        <!--内容区域-->
        <div class="col-md-10">
            <iframe src="${ctx}/main" frameborder="0" scrolling="no" id="main-body" name="main-body" width="100%"
                    height="1500px"></iframe>
        </div>
    </div>
</div>
<script src="${ctx}/js/jquery.js"></script>
<script src="${ctx}/js/bootstrap.js"></script>
<script src="${ctx}/plugin/layer/layer.js"></script>
<script>
    //iframe高度自适应
    function setIframeHeight(iframe) {
        if (iframe) {
            var iframeWin = iframe.contentWindow || iframe.contentDocument.parentWindow;
            if (iframeWin.document.body) {
                iframe.height = iframeWin.document.documentElement.scrollHeight || iframeWin.document.body.scrollHeight;
            }
        }
    };
    window.onload = function () {
        setIframeHeight(document.getElementById('main-body'));
    };
</script>
</body>
</html>