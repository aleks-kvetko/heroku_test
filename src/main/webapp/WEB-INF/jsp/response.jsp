<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet"
          href="/webjars/bootstrap/3.3.7/css/bootstrap.min.css"/>
</head>
<body>
<div align="center" class="page-header"
<c:if test="${name!=null}">
    <p style="font-size: 60px">Hi, ${name} , current time is</p>
    <p style="font-size: 100px;color: darkorchid">${time}</p>
    <c:if test="${name eq 'Inga' || name eq 'inga'}">
        <p style="font-size: 40px;color: gold">
            <a href="<c:url value = "/ade16154-1608-4e6d-8de1-704413619d93"/>">Go to secret</a>
        </p>
    </c:if>
</c:if>
<c:if test="${message!=null}">
    <p style="font-size: 120px;color: red">${message}</p>
</c:if>
</div>
</body>
</html>
