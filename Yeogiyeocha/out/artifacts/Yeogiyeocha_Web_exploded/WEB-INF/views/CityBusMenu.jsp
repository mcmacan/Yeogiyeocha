<%--
  Created by IntelliJ IDEA.
  User: chan0
  Date: 2023-01-12
  Time: 오후 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>시내버스 조회</title>
</head>
<body>
<div style="text-align: center">
    <button id="400">400번</button>
</div>
<script>
    document.getElementById("400").onclick = function () {
        location.href=location.href+"/400";
    };
</script>
</body>
</html>
