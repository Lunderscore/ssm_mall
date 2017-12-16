<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="../../static/header.jsp"%>


<title>Insert title here</title>

<style>
	.pimg{
		width: 100px;
		height: 100px;
	}
</style>

</head>
<body class="jumbotron">
	<%@ include file="../../static/navigator.jsp"%>
	
	<div class="row">
		<div class="col-md-12">
			<%@include file="../../include/shoppingCarTable.jsp" %>
		</div>
	</div>
	
	<hr>
	
	<div class="row">
		<div class="col-md-3">
			<button type="button" class="btn btn-lg btn-danger" id="delBatchBtn" disabled="disabled">删除订单</button>
		</div>
		<div class="col-md-3 col-md-offset-6">
			<button type="button" disabled="disabled" class="btn btn-lg btn-success" id="confirmItem" data-toggle="modal" data-target="#addressModal">确认订单</button>
		</div>
	</div>

	<div class="modal fade" id="addressModal" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">收货地址</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" action="payment" id="shoppingCarForm" method="post">
						<div class="form-group">
							<label for="orderPersonName" class="col-sm-3 control-label">收货人：</label>
							<div class="col-sm-9">
								<input name="orderPersonName" type="text" class="form-control" id="orderPersonName"
									placeholder="输入收货人姓名" name="empName"> <span id="helpBlock"
									class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label for="orderPhone" class="col-sm-3 control-label">手机号码：</label>
							<div class="col-sm-9">
								<input name="orderPhone" type="text" class="form-control" id="orderPhone"
									placeholder="输入联系人电话" name="email"> <span
									id="helpBlock" class="help-block"></span>
							</div>
						</div>

						<div class="form-group">
							<label for="orderAddress" class="col-sm-3 control-label">收货地址：</label>
							<div class="col-sm-9">
								<input name="orderAddress" type="text" class="form-control" id="orderAddress"
									placeholder="输入收货人地址" name="email"> <span
									id="helpBlock" class="help-block"></span>
							</div>
						</div>

						<div class="form-group">
							<label for="orderMessage" class="col-sm-3 control-label">买家留言：</label>
							<div class="col-sm-9">
								<textarea name="orderMessage" rows="3" class="form-control" id="orderMessage" placeholder="卖家留言"></textarea>
							</div>
						</div>
						<input name="orderStatus" type="hidden" value="1">
						<input name="totalMoney" type="hidden" id="hideTotalMoney">
						<input name="uoid" type="hidden" id="hideTotalhideUoid">
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="submitShoppingCar">保存</button>
				</div>
			</div>
		</div>
	</div>
	
	<script type="text/javascript" src="js/shoppingCar.js">
	</script>
</body>
</html>