<html>
<head>
<script>
function redirectToAddExpense() {
  window.location.href = "http://localhost:8080/expense";
}
function redirectToAddEarning() {
  window.location.href = "http://localhost:8080/earning";
}
function redirectToEarningDetails() {
  window.location.href = "http://localhost:8080/getEarningDetails";
}
function redirectToExpenseDetails() {
  window.location.href = "http://localhost:8080/getExpenseDetails";
}
</script>
</head>
<body>

<form method="post" modelAttribute="dashboard" action="/">
<table>

<tr>
<td>
Total Earnings
</td>
<td>
<input type = "text" id="totEarnings" name = "totEarnings" value = ${totEarning} disabled>
</td>
<td>
<input type="button" id="earningDetails" name = "earningDetails" value="Earning Details" onClick="redirectToEarningDetails()" />
</td>
</tr>

<tr>
<td>
Total Expenses
</td>
<td>
<input type = "text" id="totExpenses" name = "totExpenses" value = ${totExpense} disabled>
</td>
<td>
<input type="button" id="expenseDetails" name = "expenseDetails" value="Expense Details" onClick = "redirectToExpenseDetails()" />
</td>
</tr>

<tr>
<td>
</td>
<td>
<input type="button" id="addExpense" name = "addExpense" value="Add Expense" onClick="redirectToAddExpense()" />
</td>
<td>
<input type="button" id="addEarning" name = "addEarning"  value="Add Earning" onClick="redirectToAddEarning()" />
</td>
</tr>


</table>

</form>
</body>
  
</html>