<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="row">
    <div class="col-md-12">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="https://github.com/kpkym/ssm_mall">
                        <img height="35px" src="https://avatars3.githubusercontent.com/u/20081955"
                            style="margin-top: -8px">
                    </a>
                </div>
                <div class="collapse navbar-collapse"
                     id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="index">首页</a></li>
                        <c:if test="${not empty user }">
                            <li><a href="shoppingCar">购物车</a></li>
                            <li><a href="userOrder">个人订单</a></li>
                        </c:if>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <c:if test="${not empty user }">
                            <li id="fat-menu" class="dropdown">
                                <a id="drop3" href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                                   aria-haspopup="true" aria-expanded="false">
                                    <img alt="无头像" class="icon" id="userAvatar"
                                         src="">
                                    <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu" aria-labelledby="drop3">
                                    <li><a href="home">个人中心</a></li>
                                    <li><a href="logOut">注销</a></li>
                                </ul>
                            </li>
                        </c:if>
                        <c:if test="${empty user }">
                            <li id="fat-menu" class="dropdown">
                                <a href="login.jsp">请登录</a>
                            </li>
                        </c:if>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
</div>