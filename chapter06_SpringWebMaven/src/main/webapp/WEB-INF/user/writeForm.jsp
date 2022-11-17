<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#writeForm div{
	color:red;
	font-size:8pt;
	font-weight:bold;
}
</style>
</head>
<body>

<h3>
	<img src="../img/222.gif" width="130" height="100"><br>
	슾을잉
</h3>


<form id="writeForm">
	<table border="1" cellpadding="5" cellspacing="0">
		<tr>
			<td align="center">이름</td>
			<td>
				<input type="text" id="name" name="name">
				<div id="nameDiv"></div>
			</td>
		</tr>
		<tr>
			<td align="center">아이디</td>
			<td>
				<input type="text" id="id" name="id">
				<div id="idDiv"></div>
			</td>
		</tr>
		<tr>
			<td align="center">비밀번호</td>
			<td>
				<input type="text" id="pwd" name="pwd">
				<div id="pwdDiv"></div>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="button" id="writeBtn" value="드가자">
			</td>
		</tr>
	</table>
</form>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<!-- <script type="text/javascript" src="../js/write.js"></script> -->
<script type="text/javascript" src="../js/write.js"></script>

</body>
</html>