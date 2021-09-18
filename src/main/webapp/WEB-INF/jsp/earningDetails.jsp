<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<form method="post" modelAttribute="earningDetailForm" action="/saveEarning">
<table border = "1">
<tr>
<td>Earning Date 	</td>
<td>Earning Source  </td>
<td>Earning Payment </td> 
<td>Earning Remarks </td> 
<td></td>
</tr>
<c:forEach var = "earnObj" items="${earningDetailForm}">
<tr>
    
    <td><c:out value = "${earnObj.earnDate}"/></td>
    <td><c:out value = "${earnObj.earnSource}"/></td>
    <td><c:out value = "${earnObj.earnPayment}"/></td> 
     <td><c:out value = "${earnObj.earnRemarks}"/></td> 
  <td><input type="button" value="delete"/></td>
 </tr>
</c:forEach>


</table>
</form>
</html>