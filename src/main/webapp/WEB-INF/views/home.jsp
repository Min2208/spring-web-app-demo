<%--
  Created by IntelliJ IDEA.
  User: min2208
  Date: 01/10/2019
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <style>
        td {
            border: 1px solid cornflowerblue;
        }
    </style>
</head>
<body>
<i>User: ${account}</i>

<form>
    <fieldset>
        <legend>Customers</legend>
        <table>
            <tr>
                <td>User Name</td>
                <td>Email</td>
                <td>Address</td>
                <td>Age</td>
                <td colspan="2"><a href="/customer?action=create&id=0">Add Customer</a></td>
            </tr>

            <c:forEach items="${customers}" var="customer">
                <tr>
                    <td><a href="/customer?action=info&id=${customer.id}">${customer.name}</a></td>
                    <td>${customer.email}</td>
                    <td>${customer.address}</td>
                    <td>${customer.age}</td>
                    <td><a href="/customer?action=edit&id=${customer.id}">edit</a></td>
                    <td><a href="/customer?action=delete&id=${customer.id}">delete</a></td>
                </tr>


            </c:forEach>
        </table>


    </fieldset>

</form>
</body>
</html>
