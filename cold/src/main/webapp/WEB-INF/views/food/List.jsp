<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
차갑짱
<table>
<c:forEach items="${resultList}" var="list">
<tr>
<td>
<c:out value="${list.user_id}"/>
<c:out value="${list.user_pw}"/>
<c:out value="${list.user_name}"/>
<c:out value="${list.user_emil}"/>
<c:out value="${list.user_pnum}"/>
<c:out value="${list.food_id}"/>
<c:out value="${list.food_name}"/>
<c:out value="${list.recipe_id}"/>
<c:out value="${list.recipe_name}"/>
<c:out value="${list.recipe_url}"/>
<c:out value="${list.rfood_id}"/>
<c:out value="${list.rfood_name}"/>

</td>
</tr>
</c:forEach>
</table>

</body>
</html>