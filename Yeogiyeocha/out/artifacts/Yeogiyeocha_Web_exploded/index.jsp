<%--
  Created by IntelliJ IDEA.
  User: chan0
  Date: 2023-01-09
  Time: 오후 3:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>로그인창</title>
</head>
<body>
<div style="text-align: center">
<h1>Yeogiyeocha</h1>
<h1>Login</h1>
<form name="inputForm" method="POST" action="/Login" autocomplete="off">
    <tr>
      <td>아이디</td><td><input type="Long" name="id" id="id" ></td>
    </tr>
  <br>
  <br>
    <tr>
      <td>비밀번호</td><td><input type="password" name="pw" id="pw"></td>
    </tr>
  <br>
  <br>
    <tr><td><input type="submit" value="로그인" ></td></tr>
</form>
<button id="regident">회원가입</button>
<button id="Exit">회원탈퇴</button>
</div>
<script>
  document.getElementById("regident").onclick = function () {
    location.replace("/regident");
  };
  document.getElementById("Exit").onclick = function () {
    location.replace("/Exit");
  };
</script>
</body>
</html>
