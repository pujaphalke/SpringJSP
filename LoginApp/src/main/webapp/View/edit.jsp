<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Edit page...</h1>
<form action="update">

RollNo: <input type="text" name="rollno" value="${stu.rollno}"> <br><br>
Name: <input type="text" name="name" value="${stu.name}"> <br><br>
Username: <input type="text" name="username" value="${stu.username}"> <br><br>
Password: <input type="text" name="password" value="${stu.password}"> <br><br>
<input type="submit" value="update">

</form>
</body>
</html>