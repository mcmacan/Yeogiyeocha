<%--
  Created by IntelliJ IDEA.
  User: chan0
  Date: 2023-01-11
  Time: 오후 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원 탈퇴 진행</title>
</head>
<body>
<div style="text-align: center">
회원 탈퇴 진행
<br>
<form name="inputForm" method="POST" action="/user/D" autocomplete="off">
    <tr>
        <td>아이디</td><td><input type="Long" name="id" id="id" ></td>
    </tr>
    <br>
    <br>
    <tr>
        <td>비밀번호</td><td><input type="String" name="pw" id="pw"></td>
    </tr>
    <br>
    <br>
    <tr><td><input type="submit" value="회원 탈퇴" ></td></tr>
</form>
</div>
</body>
</html>
