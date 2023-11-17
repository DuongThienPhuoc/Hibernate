<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>Id</td>
        <td>Email</td>
        <td>FistName</td>
        <td>LastName</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="i" items="${list}">
        <tr>
            <td><c:out value="${i.id}"/></td>
            <td><c:out value="${i.email}"/></td>
            <td><c:out value="${i.firstName}"/></td>
            <td><c:out value="${i.lastName}"/></td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>