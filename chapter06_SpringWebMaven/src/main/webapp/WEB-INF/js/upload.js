$('#label').click(function(){
	$('#img').trigger('click');
})

function readURL(input){
	if(input.files[0]){
		var reader = new FileReader();
		reader.onload = function(event){ //e.target : 이벤트가 발생하는 요소를 반환해준다.
			$('#display').attr('src',event.target.result);
			$('#display').css('display','inline');
		}
		reader.readAsDataURL(input.files[0]);
	}
}

$('#img').on('change',function(){
	readURL(this);
})


$('#uploadBtn').click(function(){
	var formData = new FormData($('#uploadForm')[0]);
	$.ajax({
		type:'post',
		url:'/chapter06_SpringWebMaven/user/upload2',
		enctype: 'multipart/form-data',
		processData: false,
		contentType: false,
		data:formData,
		success: function(){
			alert('upload done');
		},
		error: function(err){
			console.log(err);
		}
	})
})