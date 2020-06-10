<%--
  Created by IntelliJ IDEA.
  User: tijesunimipeters
  Date: 6/10/20
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/sessions" method="post">
    <fieldset>
        <legend>Email</legend>
        <input type="email" name="email" />
    </fieldset>

    <fieldset>
        <legend>Password</legend>
        <input type="password" name="password" />
    </fieldset>

    <div>
        <button type="submit">Login</button>
    </div>
</form>
</body>
</html>
