<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Trang Chào Mừng</title>
</head>
<body>
    <h1><c:out value="${welcome.message}" /></h1>
    <p>Thời gian hiện tại: <c:out value="${welcome.timestamp}" /></p>
</body>
</html>
