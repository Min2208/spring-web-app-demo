<%--
  Created by IntelliJ IDEA.
  User: min2208
  Date: 01/10/2019
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login homepage</title>
</head>
<body>

<p style="color: red">${message}</p>
<form action="/check" method="post">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td><label>Account</label></td>
                <td><input type="text" name="account"></td>
            </tr>
            <tr>
                <td><label>Password</label></td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td><input type="submit" value="login"></td>
            </tr>
        </table>
    </fieldset>

</form>
</body>
</html>
