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
<c:if test="${referrer!=null}">
    <p style="font-size: 60px">Referrer: ${referrer} </p>
</c:if>
<c:if test="${referrer==null}">
    <p style="font-size: 60px">No referrer :(</p>
</c:if>
</div>
</body>
</html>
