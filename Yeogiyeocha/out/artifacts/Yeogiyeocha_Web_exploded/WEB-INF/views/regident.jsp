<%--
  Created by IntelliJ IDEA.
  User: chan0
  Date: 2023-01-11
  Time: 오후 8:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<div style="text-align: center">
<form name="inputForm" method="POST" action="/user/R" autocomplete="off">
    <tr>
        <td>아이디</td><td><input type="Long" name="Userid" id="Userid" ></td>
    </tr>
    <br>
    <tr>
        <td>이름</td><td><input type="String" name="Username" id="Username"></td>
    </tr>
    <br>
    <tr>
        <td>비밀번호</td><td><input type="String" name="Userpw" id="Userpw"></td>
    </tr>
    <br>
    <tr><td><input type="submit" value="회원가입" ></td></tr>
    <br>
    </table>
</form>
<span></span>
<button id="regident">로그인 화면으로</button>
</div>
<script>
    document.getElementById("regident").onclick = function () {
        location.href="/";
    };
</script>
</body>
</html>
