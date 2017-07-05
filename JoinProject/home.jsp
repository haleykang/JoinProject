<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>

	<!-- HomeController에서 넘긴 데이터를 가져오기 -->
	<!-- model.addAttribute("attr","넘기고 싶은 데이터"); -->
	${attr}

	<br />

	<!-- 파라미터 생성 -->
	<!-- 1. 주소 뒤에 값을 붙여서 전송 -->
	<a href="goguma.do?date=20170704&name=고구마">고구마 페이지로 이동</a>

</body>
</html>