<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
<head>
<link rel="stylesheet" href="<c:url value="/styles/style.css"/>"  type="text/css" />
</head>
 
<body>
    <div class="header">
        <tiles:insertAttribute name="header" />
    </div>
    <div class="menu">
        <tiles:insertAttribute name="menu" />
    </div>
    <div class="body">
        <tiles:insertAttribute name="body" />
    </div>
    <div class="footer">
        <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>