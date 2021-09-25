<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<form method="post" modelAttribute="expenseDetailForm" action="/saveExpense">
<table border = "1">
<tr>
<td>Expense Date 	</td>
<td>Expense Item  </td>
<td>Expense Payment </td> 
<td>Expense Remarks </td> 
<td></td>
</tr>
<c:forEach var = "expenseObj" items="${expenseDetailForm}">
<tr>
    
    
    
    <td><c:out value = "${expenseObj.expDate}"/></td>
    <td><c:out value = "${expenseObj.expItem}"/></td>
    <td><c:out value = "${expenseObj.expPayment}"/></td> 
     <td><c:out value = "${expenseObj.expRemarks}"/></td> 
  <td><input type="button" value="delete"/></td>
 </tr>
</c:forEach>


</table>
</form>
</html>