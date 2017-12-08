<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>XiaoY科学上网</title>
		<meta name="description" content="">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<link rel="stylesheet" href="/Resource/Home/css/bootstrap.min.css">
		<link rel="stylesheet" href="/Resource/Home/css/bootstrap-theme.min.css">
		<link rel="stylesheet" href="/Resource/Home/css/default/fontAwesome.css">
		<link rel="stylesheet" href="/Resource/Home/css/default/hero-slider.css">
		<link rel="stylesheet" href="/Resource/Home/css/default/owl-carousel.css">
		<link rel="stylesheet" href="/Resource/Home/css/default/templatemo-style.css">
		<link rel="stylesheet" href="/Resource/Home/css/default/lightbox.css">

		<link rel="stylesheet" href="/Resource/Home/css/pop/pop.css">
		
		<link rel="stylesheet" href="/Resource/Home/css/dialogbox/jquery.dialogbox-1.0.css">

		<script src="/Resource/Home/js/jquery/jquery-1.11.2.min.js"></script>
			
		<script src="/Resource/Home/js/vendor/bootstrap.min.js"></script>

		<script src="/Resource/Home/js/dialogbox/jquery.dialogbox-1.0.js"></script>
		<script src="/Resource/Home/js/default/main.js"></script>
		<script src="/Resource/Home/js/default/plugins.js"></script>	
		

	</head>

	<body>
		
		<div class="header">
			<div class="container">
				<nav class="navbar navbar-inverse" role="navigation">
					<div class="navbar-header">
						<button type="button" id="nav-toggle" class="navbar-toggle" data-toggle="collapse" data-target="#main-nav">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    	</button>
						<a href="#" class="navbar-brand scroll-top"><em>X</em>Y科学上网</a>
					</div>
					<!--/.navbar-header-->
					<div id="main-nav" class="collapse navbar-collapse">
						<ul class="nav navbar-nav">
							<li>
								<a href="#" class="scroll-top">客户端下载</a>
							</li>
							<li>
								<a href="#" class="scroll-link" data-id="about">点击浏览服务器</a>
							</li>
							<li>
								<a href="#" class="scroll-link" data-id="portfolio">软件介绍</a>
							</li>
							<li>
								<a href="#" class="scroll-link" data-id="contact-us">给我留言</a>
							</li>
							<li>
								<a id="console" href="#" class="scroll-top">控制台</a>
								<script>
									$(function(){
										$("#console").click(function(){
											location.href="/Page/Home/ToLogin";
										});
									});
									
								</script>
							</li>
						</ul>
					</div>
					<!--/.navbar-collapse-->
				</nav>
				<!--/.navbar-->
			</div>
			<!--/.container-->
		</div>
		<!--/.header-->

		<div class="parallax-content baner-content" id="home">
			<div class="container">
				<div class="text-content">
					<h2> <span>这是一款</span> 很棒的 <em>高性价比、可靠的的科学上网软件</em></h2>
					<p>服务器的供应商十分的可靠，质量也不错。目前已经稳定运营了许多年，所以完全不用担心您购买了服务之后出现服务器不可以使用的状况。 该软件由我一人运维者，这极大的降低了成本。所以，这是一款性价比极高的科学上网软件。当然，如果出现您解决不了的问题，您也可以给我QQ留言。工作日我 都在线，我会及时的回复
					</p>
					<div class="primary-white-button">
						<a href="#" class="scroll-link" data-id="about">服务器一览</a>
					</div>
					<div style="font-size: large;" class="primary--button">
						<a id="#" href="#" class="scroll-top">点击下载客户端</a>
					</div>
				</div>
			</div>
		</div>

		<section id="about" class="page-section">
			<div class="container">
				<div class="row">
					<div class="col-md-3 col-sm-6 col-xs-12">
						<div class="service-item">
							<div class="icon">
								<img src="Resource/Home/img/dedicated.svg" alt="">
							</div>
							<h4>经济型</h4>
							<div class="line-dec"></div>
							<p>普通型服务器，可以流畅观看Youtube480、720P视频.仅需要使用Google、fb..推荐您使用这个服务器</p>
							<p>12元/月</p>
							<div class="primary-blue-button">
								<a href="#" class="scroll-link" data-id="portfolio">点击购买</a>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 col-xs-12">
						<div class="service-item">
							<div class="icon">
								<img src="Resource/Home/img/dedicated.svg" alt="">
							</div>
							<h4>普通型</h4>
							<div class="line-dec"></div>
							<p>可以流畅观看Youtube1080P视频，如果您平时偶尔需要看看视频，推荐您使用这个服务器。</p>
							<p>20元/月</p>
							<div class="primary-blue-button">
								<a href="#" class="scroll-link" data-id="portfolio">点击购买</a>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 col-xs-12">
						<div class="service-item">
							<div class="icon">
								<img src="Resource/Home/img/dedicated.svg" alt="">
							</div>
							<h4>进阶型</h4>
							<div class="line-dec"></div>
							<p>进阶型服务器的速度可以满足您个人大多数访问网络的需求，稳定性和速度都是很不错的。</p>
							<p>40元/月</p>
							<div class="primary-blue-button">
								<a href="#" class="scroll-link" data-id="portfolio">点击购买</a>
							</div>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 col-xs-12">
						<div class="service-item">
							<div class="icon">
								<img src="Resource/Home/img/dedicated.svg" alt="">
							</div>
							<h4>私人定制</h4>
							<div class="line-dec"></div>
							<p>如果以上服务器不能满足您的需求，请联系我。我将会为您分配更好质量的服务器。可供公司、校园集体使用。</p>
							<p>150-2500/月</p>
							<div class="primary-blue-button">
								<a href="#" class="scroll-link" data-id="portfolio">点击联系客服</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>

		<div id="contact-us">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="section-heading">
							<h4>联系方式</h4>
							<div class="line-dec"></div>
							<p>您可以直接在网站上留言，每隔一段时间我会看。不过还是更加建议发邮件。我能及时的收到</p>
							<div class="pop-button">
								<h4>点击留言</h4>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6 col-md-offset-3">
						<div class="pop">
							<span>x</span>
							<form id="contact" action="#" method="post">
								<div class="row">
									<div class="col-md-12">
										<fieldset>
											<input name="name" type="text" class="form-control" id="name" placeholder="名字" required="">
										</fieldset>
									</div>
									<div class="col-md-12">
										<fieldset>
											<input name="email" type="email" class="form-control" id="email" placeholder="邮件地址" required="">
										</fieldset>
									</div>
									<div class="col-md-12">
										<fieldset>
											<textarea name="message" rows="6" class="form-control" id="message" placeholder="您想说的.." required=""></textarea>
										</fieldset>
									</div>
									<div class="col-md-12">
										<fieldset>
											<button type="submit" id="form-submit" class="btn">点击发送</button>
										</fieldset>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>

		<footer>
			<div class="container">
				<div class="row">
					<div class="col-md-4 col-sm-12">
						<div class="logo">
							<a href="#" class="scroll-top"><em>X</em>Y科学上网</a>
							<p>
								<a href="#" target="_blank" title=""></a>
								<a href="#" title="" target="_blank"></a>
							</p>
						</div>
					</div>
					<div class="col-md-4 col-sm-12">
						<div class="contact-info">
							<h4>联系我</h4>
							<ul>
								<li><em>QQ</em>: 418308127</li><br/>
								<li><em>Email</em>: sheypang@163.com</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			</div>
		</footer>


		<script type="text/javascript">
			$(document).ready(function() {
				// navigation click actions 
				$('.scroll-link').on('click', function(event) {
					event.preventDefault();
					var sectionID = $(this).attr("data-id");
					scrollToID('#' + sectionID, 750);
				});
				// scroll to top action
				$('.scroll-top').on('click', function(event) {
					event.preventDefault();
					$('html, body').animate({
						scrollTop: 0
					}, 'slow');
				});
				// mobile nav toggle
				$('#nav-toggle').on('click', function(event) {
					event.preventDefault();
					$('#main-nav').toggleClass("open");
				});
			});
			// scroll function
			function scrollToID(id, speed) {
				var offSet = 50;
				var targetOffset = $(id).offset().top - offSet;
				var mainNav = $('#main-nav');
				$('html,body').animate({
					scrollTop: targetOffset
				}, speed);
				if(mainNav.hasClass("open")) {
					mainNav.css("height", "1px").removeClass("in").addClass("collapse");
					mainNav.removeClass("open");
				}
			}
			if(typeof console === "undefined") {
				console = {
					log: function() {}
				};
			}
		</script>
	</body>
</html>