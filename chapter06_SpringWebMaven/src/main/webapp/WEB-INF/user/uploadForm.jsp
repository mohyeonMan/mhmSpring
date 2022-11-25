<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
#img, #display{
	display:none;
}
</style>
</head>
<body>

<!-- �ܼ� submit -->
<%-- <form method="post" enctype="multipart/form-data" action="/chapter06_SpringWebMaven/user/upload">
	<input type="file" name="img"><br>
	<input type="file" name="img">
	<h3>�ѹ��� ������ ������ ����</h3>
	<br><br>
	<img src="../img/pic.jpg" width="40" height="40" id="label"/>
	<input type="file" name="img[]" id="img" multiple>
	
	<input type="submit" id="uploadBtn" value="�̹��� ���">
</form>

 --%>

<!-- Ajax ��� -->
<form id="uploadForm">
	<img id="display" width="300" height="300"><br>
	<img src="../img/pic.jpg" width="40" height="40" id="label"/>
	<input type="file" name="img" id="img">
	<br><br>
	<input type="button" id="uploadBtn" value="�̹��� ���">
</form>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<script type="text/javascript" src="../js/upload.js"></script>
</body>
</html>
<!-- 
processData
 - �⺻���� true
 - �⺻������ Query String���� ��ȯ�ؼ� ��������('����=��&����=��')
 - ���� ���۽ÿ��� �ݵ�� false�� �ؾ� �Ѵ�.(formData�� ���ڿ��� ��ȯ���� �ʴ´�)
 
contentType
  - �⺻������ "application/x-www-form-urlencoded; charset=UTF-8"
  - ���� ���۽ÿ��� 'multipart/form-data'�� ������ �� �� �ֵ��� false�� �����Ѵ�

FileReader�� type�� file�� input �±� �Ǵ� API ��û�� ���� �������̽��� ���� File �Ǵ� Blob ��ü�� ���ϰ� ó���Ҽ��ִ� ����� �����ϴ� ��ü�̸�
abort, load, error�� ���� �̺�Ʈ���� �߻������μ����� ó���ϴµ� �ַ� ���Ǹ�,  File �Ǵ� Blob ��ü�� �о result �Ӽ��� �����Ѵ�.

FileReader�� �񵿱�ε����Ѵ�.

FileReader.onload()
load �̺�Ʈ�� �ڵ鷯. �� �̺�Ʈ�� �б� ������ ���������� �Ϸ�Ǿ��� ������ �߻��Ѵ�.
 -->