<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>登录</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/user/login" method="post">
        用户名: <input type="text" name="username"><br><br><br>
        密码: <input type="text" name="password"><br><br><br>
        <input type="submit" value="提交">
    </form>
</div>

</body>
</html>
