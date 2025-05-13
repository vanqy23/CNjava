<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chuyển đổi nhiệt độ</title>
</head>
<body>
<h2>Chuyển đổi nhiệt độ</h2>

    <form method="post" action="convert">
        Nhiệt độ: <input type="text" name="temperature" /><br/>
        <input type="radio" name="type" value="CtoF" checked /> Celsius to Fahrenheit
        <input type="radio" name="type" value="FtoC" /> Fahrenheit to Celsius <br/>
        <input type="submit" value="Chuyển đổi" />
    </form>

    <c:if test="${not empty error}">
        <p style="color:red">${error}</p>
    </c:if>

    <c:if test="${not empty result}">
        <p>Kết quả: <c:out value="${result}" /></p>
    </c:if>

    <p>Số lượng yêu cầu: ${applicationScope.requestCount}</p>
</body>
</html>