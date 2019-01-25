<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>主页面</title>

	<!-- Bootstrap -->
	<link rel="stylesheet" type="text/css" href="css/bootstrap-3.3.7/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/index.css">
  </head>
  <body>

  	<!-- 右下角按钮 -->
  	<!-- <button class="btn btn-default btn_right_bottom">写</button> -->
  	<!-- 图片轮播 -->
  	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  		<!-- Indicators -->
  		<ol class="carousel-indicators">
  			<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
  			<li data-target="#carousel-example-generic" data-slide-to="1"></li>
  			<li data-target="#carousel-example-generic" data-slide-to="2"></li>
  			<li data-target="#carousel-example-generic" data-slide-to="3"></li>
  			<li data-target="#carousel-example-generic" data-slide-to="4"></li>
  			<li data-target="#carousel-example-generic" data-slide-to="5"></li>
  		</ol>

  		<!-- Wrapper for slides -->
  		<div class="carousel-inner" role="listbox">
  			<div class="item active">
  				<img src="image/ic_p4.jpg">
  				<p class="carousel-caption">
  					图片
  				</p>
  			</div>
  			<div class="item">
  				<img src="image/ic_p5.jpg">
  				<p class="carousel-caption">
  					图片
  				</p>
  			</div>
  			<div class="item">
  				<img src="image/ic_p6.jpg">
  				<p class="carousel-caption">
  					图片
  				</p>
  			</div>
  			<div class="item">
  				<img src="image/ic_p7.jpg">
  				<p class="carousel-caption">
  					图片
  				</p>
  			</div>
  			<div class="item">
  				<img src="image/ic_p8.jpg">
  				<p class="carousel-caption">
  					图片
  				</p>
  			</div>
  			<div class="item">
  				<img src="image/ic_p9.jpg">
  				<p class="carousel-caption">
  					图片
  				</p>
  			</div>
  		</div>

  		<!-- Controls -->
  		<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
  			<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
  			<span class="sr-only">Previous</span>
  		</a>
  		<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
  			<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
  			<span class="sr-only">Next</span>
  		</a>
  	</div>
  	<!-- 功能模块 -->
  	<div class="row div_function">
  		<div class="col-xs-4">
  			<div class="panel panel-default" id="pFunc1">
  				<div class="panel-body">
  					<strong>选项一</strong>
  					<img class="iv_function" src="image/ic_store.svg">
  				</div>
  			</div>
  		</div>
  		<div class="col-xs-4">
  			<div class="panel panel-default"  id="pFunc2">
  				<div class="panel-body">
  					<strong>选项二</strong>
  					<img class="iv_function" src="image/ic_remeber.svg">
  				</div>
  			</div>
  		</div>
  		<div class="col-xs-4">
  			<div class="panel panel-default"  id="pFunc3">
  				<div class="panel-body">
  					<strong>选项三</strong>
  					<img class="iv_function" src="image/ic_personal.svg">
  				</div>
  			</div>
  		</div>
  	</div>
  	<!-- 技术日记 -->
  	<div class="container div_divider">
  		<!-- 分割线 -->
  		<hr class="hr_1">SSMdemo Test !<hr class="hr_2">
  		<div class="row">
  			<!-- 文章列表 -->
  			<div class="col-xs-9">
  				<div class="list-group div_article">
  					<!-- 子头栏 -->
  					<a href="#" class="list-group-item active item_article_first">
  						<span class="list-group-item-heading">
  							The first step is as good as half over!
  						</span>
  					</a>
  					<!-- 文章列表 -->
  					<div class="list-group-item item_article">
  						<div class="row">
  							<div class="div_center col-xs-9">
  								<div class="list-group-item-heading div_article_title">
  									<strong>
  										框架设计理念
  									</strong>
  								</div>
  								<p class="list-group-item-text div_article_content">
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  								</p>
  							</div>
  							<!-- 右侧图片，信息 -->
  							<div class="col-xs-3 div_right_info">
  								<img class="iv_article img-rounded" src="image/ic_android1.jpg">
  							</div>
  						</div>
  					</div>
  					<div class="list-group-item item_article">
  						<div class="row">
  							<div class="div_center col-xs-9">
  								<div class="list-group-item-heading div_article_title">
  									<strong>
  										框架设计理念
  									</strong>
  								</div>
  								<p class="list-group-item-text div_article_content">
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  								</p>
  							</div>
  							<!-- 右侧图片，信息 -->
  							<div class="col-xs-3 div_right_info">
  								<img class="iv_article img-rounded" src="image/ic_android1.jpg">
  							</div>
  						</div>
  					</div>
  					<div class="list-group-item item_article">
  						<div class="row">
  							<div class="div_center col-xs-9">
  								<div class="list-group-item-heading div_article_title">
  									<strong>
  										框架设计理念
  									</strong>
  								</div>
  								<p class="list-group-item-text div_article_content">
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  								</p>
  							</div>
  							<!-- 右侧图片，信息 -->
  							<div class="col-xs-3 div_right_info">
  								<img class="iv_article img-rounded" src="image/ic_android2.jpg">
  							</div>
  						</div>
  					</div>
  					<div class="list-group-item item_article">
  						<div class="row">
  							<div class="div_center col-xs-9">
  								<div class="list-group-item-heading div_article_title">
  									<strong>
  										框架设计理念
  									</strong>
  								</div>
  								<p class="list-group-item-text div_article_content">
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  									所有设计源于生活，框终点在于分层、层与层之间如何交流。
  								</p>
  							</div>
  							<!-- 右侧图片，信息 -->
  							<div class="col-xs-3 div_right_info">
  								<img class="iv_article img-rounded" src="image/ic_android3.jpg">
  								<div>2019/12/9 12:09</div>
  							</div>
  						</div>
  					</div>
  				</div>
  			</div>
  			<!-- 右侧 -->
  			<div class="col-xs-3 div_record">
  				<!-- 用户信息 -->
  				<div class="jumbotron div_userinfo">
  					<img class="iv_user_head img-circle" src="image/ic_p5.jpg">
  					<div style="display: inline-block; margin-left: 12px;font-size: 18px;">admin</div>
  				</div>
  				<!-- 随手记录 -->
  				<div style="display: flex;">
  					<div style="flex: 1"><hr></div>
  					<div style="text-align: center;line-height: 48px;color: #34374C">记录美好的心情</div>
  					<div style="flex: 1"><hr></div>
  				</div>
  				<input type="text" class="form-control" placeholder="标题:美好的一天...">
  				<br>
  				<textarea class="form-control" rows="3" name=textarea placeholder="内容:今天捡到一分钱！！！^_^"></textarea>
  				<br>
  				<div class="div_save">
  					<button type="button" class="btn btn-primary btn_save_record">save</button>
  				</div>
  				<hr>
  				<!-- 小功能列表 -->
  				<div class="row div_little_func">
  					<div class="col-xs-4">
  						<button class="btn btn-default btn-cricle btn_login" data-toggle="modal" data-target="#loginModal">登</button>
  					</div>
  					<div class="col-xs-4">
  						<button class="btn btn-default btn-cricle btn_stay">留</button>
  					</div>
  					<div class="col-xs-4">
  						<button class="btn btn-default btn-cricle btn_write">写</button>
  					</div>
  				</div>
  			</div>
  		</div>
  		<!-- 登录模态框 -->
  		<div class="modal fade bs-example-modal-sm" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
  			<div class="modal-dialog modal-sm" role="document">
  				<div class="modal-content">
  					<div class="modal-header">
  						<div class="modal-title" id="myModalLabel" style="text-align: center;">登录</div>
  					</div>
  					<div class="modal-body">
  						<form class="form-horizontal" style="padding: 12px;">
  							<div class="form-group">
  								<input type="text" class="form-control" id="inputEmail3" placeholder="账户名">  		
  							</div>
  							<div class="form-group">			
  								<input type="password" class="form-control" id="inputPassword3" placeholder="密码">
  							</div>
  						</form>
  					</div>
  					<div class="modal-footer" style="text-align: center;">
  						<button type="button" class="btn btn-primary" style="width: 100%">Login</button>
  					</div>
  				</div>
  			</div>
  		</div>
  	</div>


  	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  	<script src="js/jquery-3.3.1/jquery-3.3.1.min.js"></script>
  	<!-- Include all compiled plugins (below), or include individual files as needed -->
  	<script src="js/bootstrap-3.3.7/bootstrap.min.js"></script>
  	<script src="js/util.js"></script>
  </body>
  </html>