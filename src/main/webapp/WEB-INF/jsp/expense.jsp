<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

</head>
<body>

<form method="post" modelAttribute="expenseForm" action="/saveExpense">
<table>
<tr>
<td>
Date
</td>
<td>
<form:input type = "text" id="expDate" path="expenseForm.expDate"/>
</td>
</tr>

<tr>
<td>
Item
</td>
<td>

<form:input type = "text" id="expItem" path="expenseForm.expItem"/>
</td>
</tr>

<tr>
<td>
Payment
</td>
<td>

<form:input path="expenseForm.expPayment"/>
</td>
</tr>

<tr>
<td>
Remarks
</td>
<td>
<form:input path="expenseForm.expRemarks"/>
</td>
</tr>
<form:input type = "hidden" id="expId" path="expenseForm.id"/>
</table> 



<input type="submit" /> 

</form>
</body>
  
</html>