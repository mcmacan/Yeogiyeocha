<%--
  Created by IntelliJ IDEA.
  User: chan0
  Date: 2023-01-12
  Time: 오후 1:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>버스 정류장 표시</title>
</head>
<body>
<div style="text-align: center">
    <h1>${Busid}번 정류장</h1>
    <br>
<script>
  var list = new Array()
  list.push("${Busstop}")
  var Busstop = list[0].split(",",${Buscount})
  for(var i=0; i<Busstop.length; i++)
  {
      document.write(Busstop[i],'<br>','<br>')
  }
</script>
    <button id="menu">초기메뉴로</button>
    <button id="back">뒤로가기</button>
    <script>
        document.getElementById("menu").onclick = function () {
            location.href="/Login";
        };
        document.getElementById("back").onclick = function () {
            history.back();
        };
    </script>
</div>
</body>
</html>
