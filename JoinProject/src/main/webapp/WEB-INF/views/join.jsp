<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>

	<h1>회원가입</h1>
	<form action="join" method="post">

		이메일 <br> 
		<input type="email" name="email" placeholder="이메일 입력(abc@gmail.com)" /> <br> 
		비밀번호 <br> 
		<input type="password" name="pw" placeholder="비밀번호 입력" /> <br>
		강아지 이름 <br> 
		<input type="text" name="dname" placeholder="강아지 이름 입력" /> <br>
		강이지 생일 <br> 
		<input type="date" name="dbirth" /> <br> 
		<input type="submit" value="회원가입"/>
		
	</form>

</body>
</html>