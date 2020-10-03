<%@page import="bean.Method"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" href="css/mystyle.css">
    <title>Update User Page!</title>
     <style >
    body
{
	background-image: url(images/user.jpg);
	background-size: 100% 100%; 
}
   </style>
  </head>
  <body>
   <h1>Manipulate User For Update</h1>
   <% 
     String userid=request.getParameter("uid");
   		Method u=new Method();
   		u.setUid(userid);
   		Method uinfo=u.getUser();
   		out.println("name "+uinfo.getName());
   %>
    <form class="reg-form" action="updateNew" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Uid</label>
    <input type="text" class="form-control" id="uid" name="uid" value="<%=userid %>" readonly="readonly">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Name</label>
    <input type="text" class="form-control" id="na" name="name" value="<%=uinfo.getName() %>" >
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Adress</label>
    <input type="text" class="form-control" id="addr" name="adress" value="<%=uinfo.getAdress() %>">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Contact</label>
    <input type="text" class="form-control" id="cont" name="contact" value="<%=uinfo.getContact() %>">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
  
  <label>${requestScope['msg']}</label>
  </form>


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>