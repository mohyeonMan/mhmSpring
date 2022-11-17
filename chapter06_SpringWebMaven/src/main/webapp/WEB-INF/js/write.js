$('#writeBtn').click(function(){
	$('#nameDiv').empty();
	$('#idDiv').empty();
	$('#pwdDiv').empty();
	
	var name = $('#name').val();
	var id = $('#id').val();
	var pwd = $('#pwd').val();
	
	if(!name){
		$('#nameDiv').text("이름!!!!!");
		$('#name').focus();
	}else if(!id){
		$('#idDiv').text("아이디!!!!!");
		$('#id').focus();
	}else if(!pwd){
		$('#pwdDiv').text("비밀번호!!!!!");
		$('#pwd').focus();
	}else{
		$.ajax({
			type: 'post',
			url: '/chapter06_SpringWebMaven/user/write',
			data : $('#writeForm').serialize(),
			success: function(){
			alert("job done");
			},
			error: function(err){
				console.log(err);
			}
		})
	}
})
$('#id').focusout(function(){
	if($('#id').val()){
		$.ajax({
			type:'post',
			url: '/chapter06_SpringWebMaven/user/checkId',
			data : 'id='+$('#id').val(),
			dataType:'text',
			success: function(data){
				if(data==0){
					$('#idDiv').text("ㅋㅋ 사용가능");
				}else{
					$('#idDiv').text("중복된 아이디");
				}
			},
			error:function(err){
				alert('error!');
			}
		})
		
	}
})