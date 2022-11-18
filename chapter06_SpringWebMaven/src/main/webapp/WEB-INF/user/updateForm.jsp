<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#updateForm div{
	color:red;
	font-size:8pt;
	font-weight:bold;
}
</style>
</head>
<body>

<h2>
	<img src="../img/222.gif" width="130" height="100" onclick="location.href='../'" style="cursor: pointer;"><br>
	수정
</h2>
	<hr>
	<input type="text" id="result" name="result" placeholder="수정할 아이디 입력"/>
	<div id="resultDiv"></div>
<div id="updateDiv">
	<form id="updateForm">
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
					<input type="text" id="id" name="id" readonly>
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
				<input type="button" id="updateBtn" value="수정">
				<input type="button" id="resetBtn" value="취소">
				</td>
			</tr>
		</table>
	</form>
</div>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#updateDiv').hide();
	$('#result').focusin(function(){
		$('#updateDiv').hide();
	})
	
	$('#result').focusout(function(){
		if($('#result').val()){ 
			$.ajax({
				type:'post',
				url: '/chapter06_SpringWebMaven/user/getUser',
				data : 'result='+$('#result').val(),
				//dataType:'json', //data타입을 빼버리면 DTO가 아닌 null도 받아온다.
				success: function(data){
					if(data==''){
						$('#updateDiv').hide();
						$('#resultDiv').html('<h1>아이디가 없는디요</h1>');
					}else{
						$('#resultDiv').text('');
						$('#name').val(data.name);
						$('#id').val(data.id);
						$('#pwd').val(data.pwd);
						$('#updateDiv').show();
					}
				},
				error:function(err){
					alert(err);
				}
			})
		}
	})
	$('#resetBtn').click(function(){
		$('#result').trigger('focusout'); //강제 이벤트 발생. 같은 상황을 만들어준다.
	})
})

</script>
</body>
</html>