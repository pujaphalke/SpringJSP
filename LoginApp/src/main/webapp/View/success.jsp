<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="login">Login</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="edit">Edit</a>
        </li>
        
          
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<h1>Success page....</h1>
<h3>Student list:</h3>
<table border="1" class="table-success">
 <thead>
  <tr>
     <th>RollNo</th>
     <th>Name</th>
     <th>Username</th>
     <th>Password</th>
     <th colspan="2">Action</th>
  </tr>
 </thead>
  <tbody>
 <c:forEach items="${stulist}" var="stu">
   <tr>
    <td>${stu.rollno}</td>
     <td>${stu.name}</td>
      <td>${stu.username}</td>
       <td>${stu.password}</td>
       <td> <a href="delete?rno=${stu.rollno}">Delete</a> </td>
       <td> <a href="edit?rno=${stu.rollno}">Edit</a> </td>
   </tr></c:forEach>  
 </tbody>

</table>
</body>
</html>