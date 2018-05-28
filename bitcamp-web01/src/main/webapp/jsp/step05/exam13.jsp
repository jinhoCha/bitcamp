<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam12</title>
</head>
<body>

<h1>JSTL - c:redirect</h1>
<pre>
-HTTP 요청을 수행하고 그 결과를 저장하는 태그
    &lt;c:redirect url="URL"/>
                
</pre>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>나이 값이 옳지 않으면 리다이렉트 응답</h2>

<c:if test="${param.age < 1}">
    <c:redirect url="http://www.google.com"/>
    
</c:if>

나이 = ${param.age}<br>

</body>
</html>