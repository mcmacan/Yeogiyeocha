<%--
  Created by IntelliJ IDEA.
  User: chan0
  Date: 2023-01-11
  Time: 오후 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>버스 메뉴</title>
</head>
<body>
<div style="text-align: center">
    <button id="citybus">시내버스</button>
    <button id="intercitybus">시외버스</button>
    <button id="ter">터미널</button>
    <button id="CD">천안-대전</button>
    <button id="CS">천안-서울</button>
    <button id="DS">대전-서울</button>
    <button id="shuttlebus">셔틀</button>
    <br>
    <br>
    <button id="title">로그인창으로(재로그인필요)</button>
</div>
<script>
    document.getElementById("title").onclick = function () {
        location.href="/";
    };
    document.getElementById("citybus").onclick = function () {
        location.href="/cityBus";
    };
</script>
</body>
</html>
