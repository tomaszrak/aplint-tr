<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table>
<thead>
<tr><th>
Prowadzacy
</th>
</tr>
</thead>

<tbody>
	<c:forEach items="${prowadzacy}" var="prowadzacy">
	<tr>
	<td>
	${prowadzacy.imie}
	</td>
	</tr>
	
	</c:forEach>
</tbody>
</table>

