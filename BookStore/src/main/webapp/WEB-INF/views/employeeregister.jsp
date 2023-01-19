<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>Book Store</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="with: 80%">
    <tr>
     <td>Book Id</td>
     <td><input type="text" name="bookID" /></td>
    </tr>
    <tr>
     <td>Book Name</td>
     <td><input type="text" name="bookName" /></td>
    </tr>
    <tr>
     <td>Author Name</td>
     <td><input type="text" name="authorName" /></td>
    </tr>
    <tr>
     <td>Publisher Name</td>
     <td><input type="text" name="publisher" /></td>
    </tr>
   
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>