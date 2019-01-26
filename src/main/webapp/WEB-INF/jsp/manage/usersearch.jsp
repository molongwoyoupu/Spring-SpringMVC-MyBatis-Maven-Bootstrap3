<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>查询用户页面</title>

<!-- Bootstrap -->
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-3.3.7/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-table/bootstrap-table.css">
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
	<div>
		<table id="tb_departments"></table>
	</div>

	<script src="js/jquery-3.3.1/jquery-3.3.1.min.js"></script>
	<script src="js/bootstrap-3.3.7/bootstrap.min.js"></script>
	<script src="js/bootstrap-table/bootstrap-table.js"></script>
	<script src="js/bootstrap-table/bootstrap-table-zh-CN.js"></script>
	<script src="js/util.js"></script>
	<script type="text/javascript">
  	$(function () {

  	    //1.初始化Table
  	    var oTable = new TableInit();
  	    oTable.Init();

  	});
  	var TableInit = function () {
  	    var oTableInit = new Object();
  	    //初始化Table
    	oTableInit.Init = function () {
  	        $('#tb_departments').bootstrapTable({
  	            url: '${pageContext.request.contextPath}/getUserList',         //请求后台的URL（*）
  	            method: 'get',                      //请求方式（*）
  	            toolbar: '#toolbar',                //工具按钮用哪个容器
  	            striped: true,                      //是否显示行间隔色
  	            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
  	            pagination: true,                   //是否显示分页（*）
  	            sortable: false,                    //是否启用排序
  	            sortOrder: "asc",                   //排序方式
  	          	queryParamsType: "",				
  	            queryParams: oTableInit.queryParams,//传递参数（*）
  	            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
  	            pageNumber:1,                       //初始化加载第一页，默认第一页
  	            pageSize: 10,                       //每页的记录行数（*）
  	            pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
  	            search: false,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
  	            strictSearch: true,
  	            showColumns: true,                  //是否显示所有的列
  	            showRefresh: true,                  //是否显示刷新按钮
  	            minimumCountColumns: 2,             //最少允许的列数
  	            clickToSelect: true,                //是否启用点击选中行
  	            //height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
  	            uniqueId: "id",                     //每一行的唯一标识，一般为主键列
  	            showToggle:false,                    //是否显示详细视图和列表视图的切换按钮
  	            cardView: false,                    //是否显示详细视图
  	            detailView: false,                   //是否显示父子表
  	            columns: [ {
  	                field: 'id',
  	                title: 'ID',
  	              	width : '100'
  	            }, {
  	                field: 'accountNum',
  	                title: '账号',
  	              	width : '150'
  	            }, {
  	                field: 'nickName',
  	                title: '昵称',
  	                width : '150'
  	            }, {
  	                field: 'Desc',
  	                title: '描述'
  	            }, ]
  	        });
  	    };
  	    
  	    //得到查询的参数
		oTableInit.queryParams = function (params) {
			var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
				rows: params.pageSize,   //页面大小
				page: params.pageNumber  //页码
			};
			return temp;
		};
		return oTableInit;
  	};

  	</script>
</body>

</html>