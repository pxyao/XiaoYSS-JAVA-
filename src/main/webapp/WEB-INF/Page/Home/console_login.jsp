<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="UTF-8">
		<title>控制台-登录</title>
	<link rel="stylesheet" href="/Resource/Home/css/login/styles.css">
	<link rel="stylesheet" href="/Resource/Home/css/dialogbox/jquery.dialogbox-1.0.css">

	<script src="/Resource/Home/js/jquery/jquery-1.11.2.min.js"></script>
	<script src="/Resource/Home/js/dialogbox/jquery.dialogbox-1.0.js"></script>
	</head>

	<body style="background-image: url(/Resource/Home/img/blog-bg.jpg);">
		<div class="jq22-container" style="padding-top:100px">
			<div class="login-wrap">
				<div class="login-html">
					<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">登录</label>
					<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">注册</label>
					<div action class="login-form">
						<div class="sign-in-htm">
							<div class="group">
								<label for="user" class="label">用户名</label>
								<input id="user" type="text" class="input">
							</div>
							<div class="group">
								<label for="pass" class="label">密码</label>
								<input id="pass" type="password" class="input" data-type="password">
							</div>
							<div class="group">
								<input id="check" type="checkbox" class="check" checked>
								<label for="check"><span class="icon"></span>保持登录状态</label>
							</div>
							<div class="group">
								<input id="login" type="submit" class="button" value="登录">
								<script>
									$(function(){
										$("input[id='login']").click(function(){
											//校验逻辑
									        $('body').dialogbox({type:"normal",title:"信息",message:"登录成功"});
										});
									});
								</script>
							</div>
							<div class="hr"></div>
							<div class="foot-lnk">
								<a href="#forgot">忘记密码?</a>
							</div>
						</div>
						<div class="sign-up-htm">
							<div class="group">
								<label for="user" class="label">用户名</label>
								<input id="user" type="text" class="input">
							</div>
							<div class="group">
								<label for="pass" class="label">密码</label>
								<input id="pass" type="password" class="input" data-type="password">
							</div>
							<div class="group">
								<label for="pass" class="label">重复密码</label>
								<input id="pass" type="password" class="input" data-type="password">
							</div>
							<div class="group">
								<label for="pass" class="label">Email</label>
								<input id="pass" type="text" class="input">
							</div>
							<div class="group">
								<input id="register" type="submit" class="button" value="注册">
								<script>
									$(function(){
										$("input[id='register']").click(function(){
											//校验逻辑
									        $('body').dialogbox({type:"Success",title:"信息",message:"注册成功"});
									        $("input[id='tab-1']").prop("checked",true);
										});
									});
								</script>
							</div>
							<div class="hr"></div>
							<div class="foot-lnk">
								<label for="tab-1">忘记密码？</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</body>
</html>