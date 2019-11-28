<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
  <title>首页</title>
  <style type="text/css">
    a {
      text-decoration: none;
      color: black;
      font-size: 18px;
    }
    .a {
      width: 180px;
      height: 38px;
      margin: 100px auto;
      text-align: center;
      line-height: 38px;
      background: deepskyblue;
      border-radius: 4px;
    }
    .b {
      width: 180px;
      height: 38px;
      margin: 100px auto;
      text-align: center;
      line-height: 38px;
      background: deeppink;
      border-radius: 4px;
    }
  </style>
</head>
<body>

<h3 class="a">
  <a href="${pageContext.request.contextPath}/user/tologin">登录</a><br>
</h3>
<h3 class="b">
  <a href="${pageContext.request.contextPath}/user/toregister">注册</a>
</h3>
</body>
</html>