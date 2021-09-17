<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

</head>
<body>

<form method="post" modelAttribute="earningForm" action="/saveEarning">
<table>
<tr>
<td>
Date
</td>
<td>
<form:input type = "text" id="earnDate" path="earningForm.earnDate"/>
</td>
</tr>

<tr>
<td>
Source
</td>
<td>

<form:input type = "text" id="earnSource" path="earningForm.earnSource"/>
</td>
</tr>

<tr>
<td>
Payment
</td>
<td>

<form:input path="earningForm.earnPayment"/>
</td>
</tr>

<tr>
<td>
Remarks
</td>
<td>
<form:input path="earningForm.earnRemarks"/>
</td>
</tr>
<form:input type = "hidden" id="earnId" path="earningForm.earnId"/>
</table>



<input type="submit" /> 

</form>
</body>
  
</html>