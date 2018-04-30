
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Students List.......</h1>  
<table>  

<tr>
<th>StudentID</th>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Branch</th>
<th>Phone</th></tr>  
   
   <c:forEach var="student" items="${list}">   
   <tr>  
   <td>${student.StudentID}</td>  
   <td>${student.FirstName}</td>  
   <td>${student.LastName}</td>  
   <td>${student.Email}</td>  
   <td>${student.Branch}</td>  
   <td>${student.Phone}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   