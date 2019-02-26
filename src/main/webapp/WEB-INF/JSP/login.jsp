<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>shiro权限</title>
		<link href="${ctx}/css/bootstrap.css" rel="stylesheet">
	</head>

	<body>
		<div class="panel panel-default" style="width:450px;margin-left:auto;margin-right:auto;margin-top: 150px;">
			<div class="panel-heading">系统登录</div>
			<div class="panel-body">
			    <div id="info" style="color: red" align="center"></div>
				<form role="form" id="login-form" class="form-horizontal">
					<div class="form-group">
						<label class="col-md-2 control-label" for="username">用户名</label>
						<div class="col-md-6">
							<input class="form-control" type="text" name="username" placeholder="请输入用户名" value="${cookie.username.value}">
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-2 control-label" for="password">密码</label>
						<div class="col-md-6">
							<input class="form-control" type="password" name="password" placeholder="请输入密码" value="${cookie.password.value }">
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-2 control-label" for="rememberMe"></label>
						<div class="col-md-6">
							<input type="checkbox" name="rememberMe" value="1">记住我
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button id="btn1" type="button" class="btn btn-default">登录</button>
						</div>
					</div>
				</form>
			</div>
		</div>

		<script src="${ctx}/js/jquery.js"></script>
		<script src="${ctx}/js/bootstrap.js"></script>
		<script src="${ctx}/plugin/validate/jquery.validate.js"></script>
		<script src="${ctx}/plugin/validate/messages_zh.js"></script>
		
		<script type="text/javascript">
                $("#btn1").click(function () {
					$.ajax({
						url:"${ctx}/login",
						type:"POST",
						dataType:"JSON",
						data:$("#login-form").serialize(),
						success:function (data) {
							if (data.code==500){
                                $('#info').html(data.msg);
							} else {
                                //跳转到系统主页
                                window.location.href = '${ctx}/index';
							}
                        }
					})
                });


		</script>
	</body>
</html>