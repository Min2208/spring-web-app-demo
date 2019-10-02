
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/edit?id=${customer.id}" method="post">
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
            <tr><td><input type="submit" value="update"></td></tr>
        </table>

    </fieldset>

</form>

</body>
</html>
