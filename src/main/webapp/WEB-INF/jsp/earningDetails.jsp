<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<table>

<c:forEach var = "i" items="1,4,5,6,7,8,9">
<tr>
    <td>Item <c:out value = "No. ${i}"/></td>
    <td>2nd td </td>
    <td><input type="button" value="delete"/></td>
 </tr>
</c:forEach>


</table>
</html>