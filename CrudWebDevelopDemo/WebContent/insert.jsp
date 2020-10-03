<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" href="css/mystyle.css">
    <title>Add User!</title>
   <style >
    body
{
	background-image: url(images/user.jpg);
	background-size: 100% 100%; 
}
   </style>
  </head>
  <body>
    <h1>Insert Detail for Add User!</h1>
    
    <form class="reg-form card" action="addNew" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Uid</label>
    <input type="text" class="form-control" id="uid" name="uid" aria-describedby="emailHelp">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Name</label>
    <input type="text" class="form-control" id="na" name="name" aria-describedby="emailHelp">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Adress</label>
    <input type="text" class="form-control" id="addr" name="adress" aria-describedby="emailHelp">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Contact</label>
    <input type="text" class="form-control" id="cont" name="contact" aria-describedby="emailHelp">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
  
  <label>${requestScope['msg']}</label>
  
  </form>
    <table class="table">
  <thead>
    <tr>
      <th scope="col">Uid</th>
      <th scope="col">Name</th>
      <th scope="col">Adress</th>
      <th scope="col">Contact</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <jsp:useBean id="user" class="bean.Method" ></jsp:useBean>
  <c:forEach items="${user.getAllUser()}" var="us">
    <tr>
      <td>${us.getUid()}</td>
      <td>${us.getName()}</td>
      <td>${us.getAdress()}</td>
      <td>${us.getContact()}</td>
      <td>
      <a href="Update.jsp?uid=${us.getUid()}" class="btn btn-primary">
      			Edit
      </a>
      <a href="deluser?uid=${us.getUid()}" class="btn btn-danger">
      			Delete
      </a>
      </td>
    </tr>
  </tbody>
  </c:forEach>
</table>
    
     
   
 
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>