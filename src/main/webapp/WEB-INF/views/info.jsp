<%--
  Created by IntelliJ IDEA.
  User: min2208
  Date: 01/10/2019
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<i>User: ${account}</i>

<form>
    <fieldset>
        <legend>Customers</legend>
        <table>
            <tr>
                <td><label>Name</label></td>
                <td><input type="text" name="name" value="${customer.name}"></td>
            </tr>
            <tr>
                <td><label>Email</label></td>
                <td><input type="text" name="email" value="${customer.email}"></td>
            </tr>
            <tr>
                <td><label>Address</label></td>
                <td><input type="text" name="address" value="${customer.address}"></td>
            </tr>
            <tr>
                <td><label>Age</label></td>
                <td><input type="text" name="age" value="${customer.age}"></td>
            </tr>
            <tr><td><a href="/home">Back to home page</a></td></tr>
        </table>

    </fieldset>

</form>
</body>
</html>
