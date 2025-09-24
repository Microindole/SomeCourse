
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <link rel="stylesheet" type="text/css" href="../../css/miniproject.css">
    <script src="https://kit.fontawesome.com/59c20db7cc.js" crossorigin="anonymous"></script>
</head>
<body>
<div class="w">
    <div class="user-content">
        <div class="user-title">用户登录</div>
        <form action="login" class="user-form" method="POST">
<%--            <c:if test="${requestScope.loginMsg != null}">--%>
<%--                <div class="user-form-error">--%>
<%--                    <i class="fa-solid fa-circle-exclamation error-icon" ></i>--%>
<%--                    <p class="error-msg">${requestScope.loginMsg}</p>--%>
<%--                </div>--%>
<%--            </c:if>--%>
            <div class="user-form-item">
                <label for="username" class="user-form-label">
                    <i class="fa-solid fa-user"></i>
                </label>
                <input type="text" class="user-form-input" name="username" id="username" placeholder="请输入用户名" autocomplete="off">
            </div>
            <div class="user-form-item">
                <label for="password" class="user-form-label">
                    <i class="fa-solid fa-lock"></i>
                </label>
                <input type="password" class="user-form-input" name="password" id="password" placeholder="请输入密码" autocomplete="off">
            </div>
            <div class="user-form-item">
                <input type="submit" value="登录" class="user-form-submit">
            </div>
            <div class="user-form-link">
                <a href="registerForm" class="link">用户注册</a>
            </div>
        </form>
    </div>

</div>
</body>
</html>
