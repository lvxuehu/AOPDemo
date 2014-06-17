<%--
  Created by IntelliJ IDEA.
  User: liliangyang
  Date: 13-9-26
  Time: 下午1:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>${hello_1}</h2>

<h2>${hello_2}</h2>
<form method="post" action="/demo/insertuser.do">
    <input name="name" size="10">
    <input name="intro" size="10">
    <input type="submit" value="insert">
</form>
</body>
</html>