<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./joinEmpProcess.do">
이름입력: <input name="name" type="text"><br>
나이입력: <input name="age" type="text"><br>
직급입력: <input name="status" type="text"><br>
성별: <input name="gender" type="radio" value="man">남 <input name="gender" type="radio" value="woman">여<br>
생년월일: <input name="birth" type="date"><br>
희망직무: <input name="department" type="checkbox" value="SI">SI <input name="department" type="checkbox" value="SM">SM<br>
<button type="submit">제출</button>
</form>

</body>
</html>