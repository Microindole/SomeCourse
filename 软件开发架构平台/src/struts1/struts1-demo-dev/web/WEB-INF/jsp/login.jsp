<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2025/2/8
  Time: 下午9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<head>
    <title>用户登录</title>
    <script src="https://kit.fontawesome.com/59c20db7cc.js" crossorigin="anonymous"></script>
    <link rel="stylesheet"  type="text/css" href="./css/miniporject.css">
</head>
<body>
<div class="w">
    <div class="user-content">
        <div class="user-title">用户登录</div>
        <form action="login.do" class="user-form" method="post">
            <div class="user-form-item">
                <label for="username" class="user-form-label">
                    <i class="fa-solid fa-user"></i>
                </label>
                <input type="text" name="username" id="username" class="user-form-input" placeholder="请输入用户名" autocomplete="off">
            </div>
            <div class="user-form-item">
                <label for="password" class="user-form-label">
                    <i class="fa-solid fa-lock"></i>
                </label>
                <input type="password" name="password" id="password" class="user-form-input" placeholder="请输入密码" autocomplete="off">

            </div>
            <div class="user-form-item">
                <input type="submit" value="登录" class="user-form-submit">
            </div>
            <div class="user-form-submit">
                <a href="registerForm" class="link">用户注册</a>
            </div>
        </form>
    </div>
</div>
</body>
</html>
